package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: aihm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aihm implements ayqb {
    public final /* synthetic */ aihr a;
    private final /* synthetic */ int b;

    public /* synthetic */ aihm(aihr aihrVar) {
        this.a = aihrVar;
    }

    public /* synthetic */ aihm(aihr aihrVar, int i) {
        this.b = i;
        this.a = aihrVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            aihr aihrVar = this.a;
            ahhx ahhxVar = (ahhx) obj;
            if (!aihrVar.l()) {
                return;
            }
            if (ahhxVar.a() - ahhxVar.e() > 5000) {
                z = true;
            }
            aihrVar.g = z;
        } else if (i == 1) {
            this.a.c(((ahhg) obj).a());
        } else if (i == 2) {
            aihr aihrVar2 = this.a;
            ahia ahiaVar = (ahia) obj;
            if (!aihrVar2.l()) {
                return;
            }
            boolean c = ahiaVar.c();
            aihrVar2.h = c;
            if (!c && aihrVar2.g) {
                z = true;
            }
            aihrVar2.g = z;
        } else if (i == 3) {
            aihr aihrVar3 = this.a;
            ahic ahicVar = (ahic) obj;
            PlayerResponseModel c2 = ahicVar.a().c();
            if (ahicVar.a().a() != 3 || c2 == null) {
                return;
            }
            aihrVar3.c(c2);
        } else {
            ahic ahicVar2 = (ahic) obj;
            this.a.j();
        }
    }
}
