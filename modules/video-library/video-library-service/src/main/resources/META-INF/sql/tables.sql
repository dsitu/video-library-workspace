create table VL_Video (
	uuid_ VARCHAR(75) null,
	videoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	description VARCHAR(75) null,
	title VARCHAR(500) null
);