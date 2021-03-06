package com.sprylab.xar.toc.model;

import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class File {

    @Attribute
    private String id;

    @Element
    private String name;

    @Element
    private Type type;

    @Element(required = false)
    private String mode;

    @Element(required = false)
    private String uid;

    @Element(required = false)
    private String user;

    @Element(required = false)
    private String gid;

    @Element(required = false)
    private String group;

    @Element(required = false)
    private Date atime;

    @Element(required = false)
    private Date mtime;

    @Element(required = false)
    private Date ctime;

    @ElementList(inline = true, required = false, name = "file")
    private List<File> childs;

    @Element(required = false)
    private Data data;

    @ElementList(inline = true, required = false, name = "ea")
    private List<EA> eas;

    @Element(required = false)
    private String inode;

    @Element(required = false)
    private String deviceno;

    @Element(required = false)
    private FinderTime finderCreateTime;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getMode() {
        return mode;
    }

    public String getUid() {
        return uid;
    }

    public String getUser() {
        return user;
    }

    public String getGid() {
        return gid;
    }

    public String getGroup() {
        return group;
    }

    public Date getAtime() {
        return atime;
    }

    public Date getMtime() {
        return mtime;
    }

    public Date getCtime() {
        return ctime;
    }

    public List<File> getChildren() {
        return childs;
    }

    public Data getData() {
        return data;
    }

    public List<EA> getEas() {
        return eas;
    }

    public String getInode() {
        return inode;
    }

    public String getDeviceno() {
        return deviceno;
    }

    public FinderTime getFinderCreateTime() {
        return finderCreateTime;
    }

	/**
	 * @param childs the childs to set
	 */
	public void setChildren(final List<File> childs) {
		this.childs = childs;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(final Type type) {
		this.type = type;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(final String mode) {
		this.mode = mode;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(final String uid) {
		this.uid = uid;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(final String user) {
		this.user = user;
	}

	/**
	 * @param gid the gid to set
	 */
	public void setGid(final String gid) {
		this.gid = gid;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(final String group) {
		this.group = group;
	}

	/**
	 * @param atime the atime to set
	 */
	public void setAtime(final Date atime) {
		this.atime = atime;
	}

	/**
	 * @param mtime the mtime to set
	 */
	public void setMtime(final Date mtime) {
		this.mtime = mtime;
	}

	/**
	 * @param ctime the ctime to set
	 */
	public void setCtime(final Date ctime) {
		this.ctime = ctime;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(final Data data) {
		this.data = data;
	}

	/**
	 * @param eas the eas to set
	 */
	public void setEas(final List<EA> eas) {
		this.eas = eas;
	}

	/**
	 * @param inode the inode to set
	 */
	public void setInode(final String inode) {
		this.inode = inode;
	}

	/**
	 * @param deviceno the deviceno to set
	 */
	public void setDeviceno(final String deviceno) {
		this.deviceno = deviceno;
	}

	/**
	 * @param finderCreateTime the finderCreateTime to set
	 */
	public void setFinderCreateTime(final FinderTime finderCreateTime) {
		this.finderCreateTime = finderCreateTime;
	}
}
