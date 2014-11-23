package org.test.jaxb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Version
{
    private String majorVersion;

    private String minorVersion;

    private String patchVersion;

    public String getMajorVersion() {
        return majorVersion;
    }

    @XmlElement(name="major_version")
    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getMinorVersion() {
        return minorVersion;
    }

    @XmlElement(name="minor_version")
    public void setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
    }

    public String getPatchVersion() {
        return patchVersion;
    }

    @XmlElement(name="patch_version")
    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }
}
