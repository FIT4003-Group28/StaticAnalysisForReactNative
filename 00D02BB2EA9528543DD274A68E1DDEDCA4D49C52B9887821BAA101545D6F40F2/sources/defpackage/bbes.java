package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbes  reason: default package */
/* loaded from: classes3.dex */
public final class bbes extends bbfa {
    public akqi a;
    private dspd b;
    private dcdc<dkzl> c;
    private Boolean d;

    public bbes() {
    }

    public bbes(bbfb bbfbVar) {
        bbet bbetVar = (bbet) bbfbVar;
        this.a = bbetVar.a;
        this.b = bbetVar.b;
        this.c = bbetVar.c;
        this.d = Boolean.valueOf(bbetVar.d);
    }

    @Override // defpackage.bbfa
    public final void b(dspd dspdVar) {
        if (dspdVar != null) {
            this.b = dspdVar;
            return;
        }
        throw new NullPointerException("Null continuationToken");
    }

    @Override // defpackage.bbfa
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bbfa
    public final void d(List<dkzl> list) {
        this.c = dcdc.r(list);
    }

    @Override // defpackage.bbfa
    public final bbfb a() {
        String str = this.a == null ? " currentPlace" : "";
        if (this.b == null) {
            str = str.concat(" continuationToken");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" recommendedPlaces");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" isFetching");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbet(this.a, this.b, this.c, this.d.booleanValue());
    }
}
