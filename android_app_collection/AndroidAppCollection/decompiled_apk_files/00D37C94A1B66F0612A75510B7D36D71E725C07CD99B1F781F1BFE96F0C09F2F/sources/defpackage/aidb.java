package defpackage;
/* compiled from: PG */
/* renamed from: aidb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aidb implements ayqb {
    public final /* synthetic */ aidc a;
    private final /* synthetic */ int b;

    public /* synthetic */ aidb(aidc aidcVar, int i) {
        this.b = i;
        this.a = aidcVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            aidc aidcVar = this.a;
            ahhm ahhmVar = (ahhm) obj;
            if (!ahhmVar.c().b(aijx.VIDEO_WATCH_LOADED)) {
                return;
            }
            aidcVar.f = ahhmVar.a() != null ? ahhmVar.a().h : null;
            aidcVar.d();
            return;
        }
        aidc aidcVar2 = this.a;
        ahhl ahhlVar = (ahhl) obj;
        boolean z = false;
        aidcVar2.g = ahhlVar.a() == 1;
        aidcVar2.i = ahhlVar.d();
        if (ahhlVar.a() == 2) {
            z = true;
        }
        aidcVar2.h = z;
        aidcVar2.d();
    }
}
