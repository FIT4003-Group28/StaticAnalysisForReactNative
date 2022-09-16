package defpackage;

import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: kul  reason: default package */
/* loaded from: classes3.dex */
final class kul implements yiw {
    final /* synthetic */ kum a;

    public kul(kum kumVar) {
        this.a = kumVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r3 = (Void) obj;
        zdy a = this.a.a.a(exc);
        this.a.z.b(a.a, true);
        fyv.g(this.a.A, a.b);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r6 = (Void) obj;
        List list = (List) obj2;
        if (this.a.b.a()) {
            this.a.A.F(acuo.a(122502), acuc.DEFAULT, null);
        }
        if (list.size() == 0) {
            kum kumVar = this.a;
            ajsm ajsmVar = kumVar.c;
            aopa createBuilder = apke.a.createBuilder();
            aopa createBuilder2 = apkf.a.createBuilder();
            createBuilder2.copyOnWrite();
            apkf apkfVar = (apkf) createBuilder2.instance;
            apkfVar.c = 1;
            apkfVar.b |= 1;
            createBuilder.copyOnWrite();
            apke apkeVar = (apke) createBuilder.instance;
            apkf apkfVar2 = (apkf) createBuilder2.mo39build();
            apkfVar2.getClass();
            apkeVar.j = apkfVar2;
            apkeVar.b |= 256;
            aopa createBuilder3 = apkg.a.createBuilder();
            arhr arhrVar = arhr.EMPTY_SEARCH;
            createBuilder3.copyOnWrite();
            apkg apkgVar = (apkg) createBuilder3.instance;
            apkgVar.c = arhrVar.pS;
            apkgVar.b |= 1;
            createBuilder.copyOnWrite();
            apke apkeVar2 = (apke) createBuilder.instance;
            apkg apkgVar2 = (apkg) createBuilder3.mo39build();
            apkgVar2.getClass();
            apkeVar2.d = apkgVar2;
            apkeVar2.c = 3;
            arag g = ajgl.g(kumVar.y.getString(R.string.no_saved_videos_found));
            createBuilder.copyOnWrite();
            apke apkeVar3 = (apke) createBuilder.instance;
            g.getClass();
            apkeVar3.e = g;
            apkeVar3.b |= 1;
            ajsmVar.add((apke) createBuilder.mo39build());
        } else {
            this.a.c.addAll(list);
        }
        this.a.z.a();
    }
}
