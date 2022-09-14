package defpackage;
/* compiled from: PG */
/* renamed from: bbsk  reason: default package */
/* loaded from: classes3.dex */
final class bbsk extends bbts {
    private final bbuy a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final String f;
    private final boolean g;
    private final int h;
    private final aojq i;

    public bbsk(bbuy bbuyVar, int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, aojq aojqVar, boolean z) {
        this.a = bbuyVar;
        this.h = i;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
        this.f = str;
        this.i = aojqVar;
        this.g = z;
    }

    @Override // defpackage.bbts
    public final bbuy a() {
        return this.a;
    }

    @Override // defpackage.bbts
    @dzsi
    public final bbvd b() {
        return null;
    }

    @Override // defpackage.bbts
    public final Boolean c() {
        return this.b;
    }

    @Override // defpackage.bbts
    public final Boolean d() {
        return this.c;
    }

    @Override // defpackage.bbts
    public final Boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        aojq aojqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbts) {
            bbts bbtsVar = (bbts) obj;
            if (this.a.equals(bbtsVar.a()) && bbtsVar.b() == null) {
                int i = this.h;
                int i2 = bbtsVar.i();
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(bbtsVar.c()) && this.c.equals(bbtsVar.d()) && this.d.equals(bbtsVar.e()) && this.e.equals(bbtsVar.f()) && ((str = this.f) != null ? str.equals(bbtsVar.g()) : bbtsVar.g() == null) && ((aojqVar = this.i) != null ? aojqVar.equals(bbtsVar.j()) : bbtsVar.j() == null) && this.g == bbtsVar.h()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bbts
    public final Boolean f() {
        return this.e;
    }

    @Override // defpackage.bbts
    @dzsi
    public final String g() {
        return this.f;
    }

    @Override // defpackage.bbts
    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * (-721379959);
        int i = this.h;
        if (i != 0) {
            int hashCode2 = (((((((((hashCode ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
            String str = this.f;
            int i2 = 0;
            int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
            aojq aojqVar = this.i;
            if (aojqVar != null) {
                i2 = aojqVar.hashCode();
            }
            return ((hashCode3 ^ i2) * 1000003) ^ (true != this.g ? 1237 : 1231);
        }
        throw null;
    }

    @Override // defpackage.bbts
    public final int i() {
        return this.h;
    }

    @Override // defpackage.bbts
    @dzsi
    public final aojq j() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.h;
        String str = i != 1 ? i != 2 ? "null" : "BACK" : "OPEN_UNIFIED_PHOTO_UPLOAD_FLOW";
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String str2 = this.f;
        String valueOf6 = String.valueOf(this.i);
        boolean z = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = "null".length();
        int length3 = str.length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 273 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(str2).length() + String.valueOf(valueOf6).length());
        sb.append("LiveCameraOption{afterUploadBehavior=");
        sb.append(valueOf);
        sb.append(", placePickerOptions=");
        sb.append("null");
        sb.append(", nextButtonBehavior=");
        sb.append(str);
        sb.append(", isSinglePhotoCaptureEnabled=");
        sb.append(valueOf2);
        sb.append(", isGalleryEnabled=");
        sb.append(valueOf3);
        sb.append(", isEditCaptionEnabled=");
        sb.append(valueOf4);
        sb.append(", isVideoRecordingEnabled=");
        sb.append(valueOf5);
        sb.append(", customLightBoxTitle=");
        sb.append(str2);
        sb.append(", liveCameraTutorialControllerFactory=");
        sb.append(valueOf6);
        sb.append(", hidePhotosFromMediaScanners=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
