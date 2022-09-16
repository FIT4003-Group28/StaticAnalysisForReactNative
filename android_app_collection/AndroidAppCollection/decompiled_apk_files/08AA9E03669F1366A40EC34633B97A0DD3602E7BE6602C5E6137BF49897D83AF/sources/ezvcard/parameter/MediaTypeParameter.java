package ezvcard.parameter;
/* loaded from: classes.dex */
public class MediaTypeParameter extends VCardParameter {

    /* renamed from: d  reason: collision with root package name */
    protected final String f5553d;
    protected final String e;

    public MediaTypeParameter(String str, String str2, String str3) {
        super(str);
        this.f5553d = str2;
        this.e = str3;
    }

    public String a() {
        return this.f5553d;
    }

    public String b() {
        return this.e;
    }

    @Override // ezvcard.parameter.VCardParameter
    public int hashCode() {
        int i = 0;
        int hashCode = ((super.hashCode() * 31) + (this.e == null ? 0 : this.e.hashCode())) * 31;
        if (this.f5553d != null) {
            i = this.f5553d.hashCode();
        }
        return hashCode + i;
    }

    @Override // ezvcard.parameter.VCardParameter
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        MediaTypeParameter mediaTypeParameter = (MediaTypeParameter) obj;
        if (this.e == null) {
            if (mediaTypeParameter.e != null) {
                return false;
            }
        } else if (!this.e.equals(mediaTypeParameter.e)) {
            return false;
        }
        if (this.f5553d == null) {
            if (mediaTypeParameter.f5553d != null) {
                return false;
            }
        } else if (!this.f5553d.equals(mediaTypeParameter.f5553d)) {
            return false;
        }
        return true;
    }
}
