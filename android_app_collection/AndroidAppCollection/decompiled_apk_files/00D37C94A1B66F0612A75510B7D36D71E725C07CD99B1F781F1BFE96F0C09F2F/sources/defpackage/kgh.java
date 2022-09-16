package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
/* compiled from: PG */
/* renamed from: kgh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kgh implements ayqb {
    public final /* synthetic */ kgi a;
    private final /* synthetic */ int b;

    public /* synthetic */ kgh(kgi kgiVar, int i) {
        this.b = i;
        this.a = kgiVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        aube aubeVar;
        aube aubeVar2;
        aqtb aqtbVar;
        int i = this.b;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                kgi kgiVar = this.a;
                if (((ezx) obj) != ezx.WATCH_WHILE_FULLSCREEN) {
                    z = false;
                }
                kgiVar.i = z;
                kgiVar.a(false);
                return;
            }
            kgi kgiVar2 = this.a;
            boolean c = ((ahhw) obj).c().c(aika.READY);
            if (kgiVar2.h == c) {
                return;
            }
            kgiVar2.h = c;
            kgiVar2.a(false);
            return;
        }
        kgi kgiVar3 = this.a;
        WatchNextResponseModel a = ((ahhm) obj).a();
        if (a == null) {
            return;
        }
        asgt asgtVar = a.a;
        asgf asgfVar = asgtVar.f;
        if (asgfVar == null) {
            asgfVar = asgf.a;
        }
        if (asgfVar.b == 78882851) {
            aubeVar = (aube) asgfVar.c;
        } else {
            aubeVar = aube.a;
        }
        aunb aunbVar = aubeVar.l;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
            aqtbVar = null;
        } else {
            asgf asgfVar2 = asgtVar.f;
            if (asgfVar2 == null) {
                asgfVar2 = asgf.a;
            }
            if (asgfVar2.b == 78882851) {
                aubeVar2 = (aube) asgfVar2.c;
            } else {
                aubeVar2 = aube.a;
            }
            aunb aunbVar2 = aubeVar2.l;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aqtbVar = (aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer);
        }
        kgiVar3.c(aqtbVar);
    }
}
