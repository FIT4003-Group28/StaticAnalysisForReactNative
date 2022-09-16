package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: jix  reason: default package */
/* loaded from: classes3.dex */
public final class jix implements jic {
    private final Context a;
    private final aagi b;
    private final snc c;
    private final jie d;

    public jix(Context context, aagi aagiVar, snc sncVar, jie jieVar) {
        this.b = aagiVar;
        this.a = context;
        this.c = sncVar;
        this.d = jieVar;
    }

    @Override // defpackage.jic
    public final int a() {
        return 164;
    }

    @Override // defpackage.jic
    public final int b() {
        return 224;
    }

    @Override // defpackage.jic
    public final /* bridge */ /* synthetic */ jia c(aajj aajjVar, String str, jib jibVar) {
        awka awkaVar = (awka) aajjVar;
        aagh c = this.b.c();
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = aqop.a.createBuilder();
        createBuilder.copyOnWrite();
        aqop aqopVar = (aqop) createBuilder.instance;
        aqopVar.c |= 1;
        aqopVar.d = str;
        aqom aqomVar = new aqom(createBuilder);
        if (nni.r(ampq.i(awkaVar), c)) {
            aqomVar.j(this.a.getString(R.string.travel_error_message));
            aqomVar.k(Integer.valueOf(actj.DOWNLOADS_PAGE_TRAVEL_BANNER.II));
            aqomVar.c(akzj.h(this.a.getString(R.string.learn_more)));
            aqomVar.b("https://support.google.com/youtube/answer/6307365");
            aqomVar.d(Integer.valueOf(actj.DOWNLOADS_PAGE_TRAVEL_BANNER_LEARN_MORE_BUTTON.II));
        } else {
            long h = nni.h(ampq.i(awkaVar), this.c, c);
            if (h < 2147483647L) {
                aqomVar.j(nni.p(this.a, h, false));
                aqomVar.k(Integer.valueOf(actj.DOWNLOADS_PAGE_TEXIT_BANNER.II));
                aqomVar.c(akzj.h(this.a.getString(R.string.learn_more)));
                aqomVar.b("https://support.google.com/youtube/answer/6141269");
                aqomVar.d(Integer.valueOf(actj.DOWNLOADS_PAGE_TEXIT_BANNER_LEARN_MORE_BUTTON.II));
            }
        }
        return jia.a(aqomVar.l());
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        return ampq.j(emn.i());
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        String i = emn.i();
        amvl i2 = amvn.i();
        i2.c(this.d.a(i));
        HashSet hashSet = new HashSet();
        for (String str2 : (List) this.b.c().f(i).g(awka.class).O().t(iyw.s).I(jgs.f).V(iyw.t).I(jgs.g).aq().U()) {
            hashSet.add(this.d.a(str2));
            hashSet.add(this.d.a(emn.q(aakj.g(str2))));
        }
        i2.j(hashSet);
        return i2.g();
    }

    @Override // defpackage.jic
    public final Class f() {
        return awka.class;
    }

    @Override // defpackage.jic
    public final Class g() {
        return aqoo.class;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(2, str);
    }
}
