package defpackage;
/* compiled from: PG */
/* renamed from: bbst  reason: default package */
/* loaded from: classes3.dex */
final class bbst extends bbuj {
    private final String b;
    private final dwyd c;
    private final cjqm d;
    private final dbsg<bbuk> e;
    private final dbsg<cdfp> f;
    private final dbsg<dcdc<String>> g;
    private final dbsg<Integer> h;
    private final dbsg<Boolean> i;
    private final dcet<bbvh, bbtj> j;
    private final dcet<bbvh, bbtn> k;

    public bbst(String str, dwyd dwydVar, cjqm cjqmVar, dbsg<bbuk> dbsgVar, dbsg<cdfp> dbsgVar2, dbsg<dcdc<String>> dbsgVar3, dbsg<Integer> dbsgVar4, dbsg<Boolean> dbsgVar5, dcet<bbvh, bbtj> dcetVar, dcet<bbvh, bbtn> dcetVar2) {
        this.b = str;
        this.c = dwydVar;
        this.d = cjqmVar;
        this.e = dbsgVar;
        this.f = dbsgVar2;
        this.g = dbsgVar3;
        this.h = dbsgVar4;
        this.i = dbsgVar5;
        this.j = dcetVar;
        this.k = dcetVar2;
    }

    @Override // defpackage.bbuj
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bbuj
    public final dwyd b() {
        return this.c;
    }

    @Override // defpackage.bbuj
    public final cjqm c() {
        return this.d;
    }

    @Override // defpackage.bbuj
    public final dbsg<bbuk> d() {
        return this.e;
    }

    @Override // defpackage.bbuj
    public final dbsg<cdfp> e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbuj) {
            bbuj bbujVar = (bbuj) obj;
            if (this.b.equals(bbujVar.a()) && this.c.equals(bbujVar.b()) && this.d.equals(bbujVar.c()) && this.e.equals(bbujVar.d()) && this.f.equals(bbujVar.e()) && this.g.equals(bbujVar.f()) && this.h.equals(bbujVar.g()) && this.i.equals(bbujVar.h()) && dckz.f(this.j, bbujVar.i()) && dckz.f(this.k, bbujVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bbuj
    public final dbsg<dcdc<String>> f() {
        return this.g;
    }

    @Override // defpackage.bbuj
    public final dbsg<Integer> g() {
        return this.h;
    }

    @Override // defpackage.bbuj
    public final dbsg<Boolean> h() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.bbuj
    public final dcet<bbvh, bbtj> i() {
        return this.j;
    }

    @Override // defpackage.bbuj
    public final dcet<bbvh, bbtn> j() {
        return this.k;
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 199 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("PhotoUploaderRequest{accountName=");
        sb.append(str);
        sb.append(", entryPoint=");
        sb.append(valueOf);
        sb.append(", loggedInteraction=");
        sb.append(valueOf2);
        sb.append(", uploadListener=");
        sb.append(valueOf3);
        sb.append(", importListener=");
        sb.append(valueOf4);
        sb.append(", ugcsContentIds=");
        sb.append(valueOf5);
        sb.append(", clearRecordTtlInSeconds=");
        sb.append(valueOf6);
        sb.append(", enableCheckPsExistence=");
        sb.append(valueOf7);
        sb.append(", uploadPhotos=");
        sb.append(valueOf8);
        sb.append(", importPhotos=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }
}
