package defpackage;
/* compiled from: PG */
/* renamed from: bbso  reason: default package */
/* loaded from: classes3.dex */
final class bbso extends bbua {
    private final dcdc<dwfl> a;
    private final dcep<dwfl> b;
    private final dcdn<String, Boolean> c;
    private final dcep<String> d;
    private final dcdn<String, dqjc> e;
    private final int f;

    public bbso(int i, dcdc<dwfl> dcdcVar, dcep<dwfl> dcepVar, dcdn<String, Boolean> dcdnVar, dcep<String> dcepVar2, dcdn<String, dqjc> dcdnVar2) {
        this.f = i;
        this.a = dcdcVar;
        this.b = dcepVar;
        this.c = dcdnVar;
        this.d = dcepVar2;
        this.e = dcdnVar2;
    }

    @Override // defpackage.bbua
    public final dcdc<dwfl> a() {
        return this.a;
    }

    @Override // defpackage.bbua
    public final dcep<dwfl> b() {
        return this.b;
    }

    @Override // defpackage.bbua
    public final dcdn<String, Boolean> c() {
        return this.c;
    }

    @Override // defpackage.bbua
    public final dcep<String> d() {
        return this.d;
    }

    @Override // defpackage.bbua
    public final dcdn<String, dqjc> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbua)) {
            return false;
        }
        bbua bbuaVar = (bbua) obj;
        int i = this.f;
        int f = bbuaVar.f();
        if (i == 0) {
            throw null;
        }
        return i == f && dchl.m(this.a, bbuaVar.a()) && this.b.equals(bbuaVar.b()) && this.c.equals(bbuaVar.c()) && this.d.equals(bbuaVar.d()) && this.e.equals(bbuaVar.e());
    }

    @Override // defpackage.bbua
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return ((((((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.f;
        String str = i != 1 ? i != 2 ? "null" : "SAVE_BUTTON_PRESSED" : "BACK_BUTTON_PRESSED";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 145 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("PhotoLightboxFragmentResult{fragmentCloseAction=");
        sb.append(str);
        sb.append(", photoDescriptions=");
        sb.append(valueOf);
        sb.append(", mutedVideos=");
        sb.append(valueOf2);
        sb.append(", photoIdsSelectionStatus=");
        sb.append(valueOf3);
        sb.append(", visitedPhotoIds=");
        sb.append(valueOf4);
        sb.append(", latestVoteInfos=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
