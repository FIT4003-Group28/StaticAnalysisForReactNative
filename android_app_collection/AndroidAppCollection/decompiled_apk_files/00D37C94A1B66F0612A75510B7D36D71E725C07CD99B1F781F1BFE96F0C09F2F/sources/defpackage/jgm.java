package defpackage;

import com.google.android.youtube.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: jgm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jgm implements Callable {
    public final /* synthetic */ jgn a;
    public final /* synthetic */ amuk b;
    public final /* synthetic */ ampq c;
    public final /* synthetic */ amuk d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ amuk i;
    public final /* synthetic */ int j;
    public final /* synthetic */ ampq k;
    private final /* synthetic */ int l;

    public /* synthetic */ jgm(jgn jgnVar, amuk amukVar, ampq ampqVar, amuk amukVar2, String str, String str2, boolean z, String str3, amuk amukVar3, int i, ampq ampqVar2) {
        this.a = jgnVar;
        this.b = amukVar;
        this.c = ampqVar;
        this.d = amukVar2;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = str3;
        this.i = amukVar3;
        this.j = i;
        this.k = ampqVar2;
    }

    public /* synthetic */ jgm(jgn jgnVar, amuk amukVar, ampq ampqVar, amuk amukVar2, String str, String str2, boolean z, String str3, amuk amukVar3, int i, ampq ampqVar2, int i2) {
        this.l = i2;
        this.a = jgnVar;
        this.b = amukVar;
        this.c = ampqVar;
        this.d = amukVar2;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = str3;
        this.i = amukVar3;
        this.j = i;
        this.k = ampqVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.l;
        if (i != 0) {
            if (i == 1) {
                jgn jgnVar = this.a;
                amuk amukVar = this.b;
                ampq ampqVar = this.c;
                amuk amukVar2 = this.d;
                String str = this.e;
                String str2 = this.f;
                boolean z = this.g;
                String str3 = this.h;
                amuk amukVar3 = this.i;
                int i2 = this.j;
                ampq ampqVar2 = this.k;
                amuk a = jgn.a(amukVar3);
                String concat = str3.concat("_selected_values");
                aopa createBuilder = aqnw.a.createBuilder();
                createBuilder.copyOnWrite();
                aqnw aqnwVar = (aqnw) createBuilder.instance;
                aqnwVar.b |= 1;
                aqnwVar.c = z;
                if (!amukVar.isEmpty()) {
                    createBuilder.copyOnWrite();
                    aqnw aqnwVar2 = (aqnw) createBuilder.instance;
                    aqnwVar2.d = (aqnl) ampqVar.c();
                    aqnwVar2.b |= 2;
                }
                if (!amukVar2.isEmpty()) {
                    aqnh aqnhVar = (aqnh) amukVar2.get(0);
                    createBuilder.copyOnWrite();
                    aqnw aqnwVar3 = (aqnw) createBuilder.instance;
                    aqnhVar.getClass();
                    aqnwVar3.e = aqnhVar;
                    aqnwVar3.b |= 4;
                }
                aqnw aqnwVar4 = (aqnw) createBuilder.mo39build();
                boolean isEmpty = amukVar2.isEmpty();
                aqnp b = jgnVar.b(amukVar, amukVar2, a, i2, concat, isEmpty);
                jgo jgoVar = jgnVar.f;
                aopg aopgVar = aqnq.b;
                aopa createBuilder2 = aqnq.a.createBuilder();
                createBuilder2.copyOnWrite();
                aqnq aqnqVar = (aqnq) createBuilder2.instance;
                b.getClass();
                aqnqVar.d = b;
                aqnqVar.c |= 1;
                createBuilder2.copyOnWrite();
                aqnq aqnqVar2 = (aqnq) createBuilder2.instance;
                aqnwVar4.getClass();
                aqnqVar2.e = aqnwVar4;
                aqnqVar2.c |= 2;
                createBuilder2.copyOnWrite();
                aqnq aqnqVar3 = (aqnq) createBuilder2.instance;
                str3.getClass();
                aqnqVar3.c |= 64;
                aqnqVar3.f = str3;
                ampq a2 = jgoVar.a(R.raw.download_options_picker_body_element_android, aopgVar, (aqnq) createBuilder2.mo39build());
                if (!a2.h()) {
                    return amon.a;
                }
                aqns d = jgnVar.d(amukVar, str, str2, 3, ampqVar2, concat, isEmpty);
                jgo jgoVar2 = jgnVar.f;
                aopg aopgVar2 = aqnt.b;
                aopa createBuilder3 = aqnt.a.createBuilder();
                createBuilder3.copyOnWrite();
                aqnt aqntVar = (aqnt) createBuilder3.instance;
                d.getClass();
                aqntVar.d = d;
                aqntVar.c = 1 | aqntVar.c;
                createBuilder3.copyOnWrite();
                aqnt aqntVar2 = (aqnt) createBuilder3.instance;
                aqnwVar4.getClass();
                aqntVar2.e = aqnwVar4;
                aqntVar2.c |= 2;
                ampq a3 = jgoVar2.a(R.raw.download_options_picker_footer_element_android, aopgVar2, (aqnt) createBuilder3.mo39build());
                if (!a3.h()) {
                    return amon.a;
                }
                aopa createBuilder4 = awsq.a.createBuilder();
                awnn awnnVar = (awnn) a2.c();
                createBuilder4.copyOnWrite();
                awsq awsqVar = (awsq) createBuilder4.instance;
                aopu aopuVar = awsqVar.f;
                if (!aopuVar.c()) {
                    awsqVar.f = aopi.mutableCopy(aopuVar);
                }
                awsqVar.f.add(awnnVar);
                createBuilder4.copyOnWrite();
                awsq awsqVar2 = (awsq) createBuilder4.instance;
                awsqVar2.e = (awnn) a3.c();
                awsqVar2.c |= 2;
                return ampq.j((awsq) createBuilder4.mo39build());
            }
            return this.a.c(this.b, this.c, this.d, this.e, this.f, this.g, 2, this.h, this.i, this.j, this.k).b(jgl.b);
        }
        return this.a.c(this.b, this.c, this.d, this.e, this.f, this.g, 3, this.h, this.i, this.j, this.k).b(jgl.a);
    }
}
