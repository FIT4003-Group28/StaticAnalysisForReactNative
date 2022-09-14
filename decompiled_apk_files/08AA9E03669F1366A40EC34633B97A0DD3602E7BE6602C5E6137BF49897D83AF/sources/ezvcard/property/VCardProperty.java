package ezvcard.property;

import com.b.a.a.a;
import com.b.a.a.c.b;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.ValidationWarning;
import ezvcard.c;
import ezvcard.parameter.Pid;
import ezvcard.parameter.VCardParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class VCardProperty implements Comparable<VCardProperty> {
    protected String group;
    protected VCardParameters parameters;

    protected void _validate(List<ValidationWarning> list, VCardVersion vCardVersion, VCard vCard) {
    }

    public VCardProperty() {
        this.parameters = new VCardParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VCardProperty(VCardProperty vCardProperty) {
        this.group = vCardProperty.group;
        this.parameters = new VCardParameters(vCardProperty.parameters);
    }

    public final VCardVersion[] getSupportedVersions() {
        c cVar = (c) getClass().getAnnotation(c.class);
        return cVar == null ? VCardVersion.values() : cVar.a();
    }

    public final boolean isSupportedBy(VCardVersion vCardVersion) {
        for (VCardVersion vCardVersion2 : getSupportedVersions()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public final List<ValidationWarning> validate(VCardVersion vCardVersion, VCard vCard) {
        ArrayList arrayList = new ArrayList(0);
        if (!isSupportedBy(vCardVersion)) {
            arrayList.add(new ValidationWarning(2, Arrays.toString(getSupportedVersions())));
        }
        arrayList.addAll(this.parameters.a(vCardVersion));
        if (this.group != null) {
            a syntaxStyle = vCardVersion.getSyntaxStyle();
            com.b.a.a.c.a a2 = b.a(syntaxStyle, true);
            if (!a2.a(this.group)) {
                if (syntaxStyle == a.OLD) {
                    arrayList.add(new ValidationWarning(32, this.group, a2.a().a(true)));
                } else {
                    arrayList.add(new ValidationWarning(23, this.group));
                }
            }
        }
        _validate(arrayList, vCardVersion, vCard);
        return arrayList;
    }

    public VCardParameters getParameters() {
        return this.parameters;
    }

    public void setParameters(VCardParameters vCardParameters) {
        if (vCardParameters == null) {
            throw new NullPointerException(ezvcard.b.INSTANCE.c(42, new Object[0]));
        }
        this.parameters = vCardParameters;
    }

    public String getParameter(String str) {
        return this.parameters.c((VCardParameters) str);
    }

    public List<String> getParameters(String str) {
        return Collections.unmodifiableList(this.parameters.b((VCardParameters) str));
    }

    public void setParameter(String str, String str2) {
        this.parameters.b(str, str2);
    }

    public void addParameter(String str, String str2) {
        this.parameters.a((VCardParameters) str, str2);
    }

    public void removeParameter(String str) {
        this.parameters.d((VCardParameters) str);
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(VCardProperty vCardProperty) {
        Integer l = getParameters().l();
        Integer l2 = vCardProperty.getParameters().l();
        if (l == null && l2 == null) {
            return 0;
        }
        if (l == null) {
            return 1;
        }
        if (l2 != null) {
            return l2.compareTo(l);
        }
        return -1;
    }

    protected Map<String, Object> toStringValues() {
        return Collections.emptyMap();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" [ group=");
        sb.append(this.group);
        sb.append(" | parameters=");
        sb.append(this.parameters);
        for (Map.Entry<String, Object> entry : toStringValues().entrySet()) {
            Object value = entry.getValue();
            sb.append(" | ");
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(value);
        }
        sb.append(" ]");
        return sb.toString();
    }

    /* renamed from: copy */
    public VCardProperty mo226copy() {
        Class<?> cls = getClass();
        try {
            return (VCardProperty) cls.getConstructor(cls).newInstance(this);
        } catch (Exception e) {
            throw new UnsupportedOperationException(ezvcard.b.INSTANCE.c(31, cls.getName()), e);
        }
    }

    public int hashCode() {
        return (((this.group == null ? 0 : this.group.toLowerCase().hashCode()) + 31) * 31) + this.parameters.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCardProperty vCardProperty = (VCardProperty) obj;
        if (this.group == null) {
            if (vCardProperty.group != null) {
                return false;
            }
        } else if (!this.group.equalsIgnoreCase(vCardProperty.group)) {
            return false;
        }
        return this.parameters.equals(vCardProperty.parameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Pid> getPids() {
        return this.parameters.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer getPref() {
        return this.parameters.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPref(Integer num) {
        this.parameters.b(num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getLanguage() {
        return this.parameters.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLanguage(String str) {
        this.parameters.c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer getIndex() {
        return this.parameters.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIndex(Integer num) {
        this.parameters.a(num);
    }
}
