package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.feedback.FeedbackOptions;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qst  reason: default package */
/* loaded from: classes4.dex */
public class qst implements qsy {
    public final qtp A;
    public final Looper B;
    public final int C;
    public final qsx D;
    protected final quq E;
    private final qvs a;
    public final Context w;
    public final String x;
    public final qso y;
    public final qsm z;

    public qst(Context context, Activity activity, qso qsoVar, qsm qsmVar, qss qssVar) {
        qnm.n(context, "Null context is not permitted.");
        qnm.n(qsoVar, "Api must not be null.");
        qnm.n(qssVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.w = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.x = str;
        this.y = qsoVar;
        this.z = qsmVar;
        this.B = qssVar.c;
        qtp qtpVar = new qtp(qsoVar, qsmVar, str);
        this.A = qtpVar;
        this.D = new qur(this);
        quq c = quq.c(this.w);
        this.E = c;
        this.C = c.j.getAndIncrement();
        this.a = qssVar.b;
        if (activity != null && Looper.myLooper() == Looper.getMainLooper()) {
            qux m = quf.m(activity);
            quf qufVar = (quf) m.b("ConnectionlessLifecycleHelper", quf.class);
            qufVar = qufVar == null ? new quf(m, c) : qufVar;
            qufVar.d.add(qtpVar);
            c.g(qufVar);
        }
        Handler handler = c.o;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    private final rve a(int i, qvy qvyVar) {
        rvh rvhVar = new rvh();
        quq quqVar = this.E;
        qvs qvsVar = this.a;
        quqVar.d(rvhVar, qvyVar.d, this);
        qtm qtmVar = new qtm(i, qvyVar, rvhVar, qvsVar);
        Handler handler = quqVar.o;
        handler.sendMessage(handler.obtainMessage(4, new qvi(qtmVar, quqVar.k.get(), this)));
        return rvhVar.a;
    }

    public final rve A(String str) {
        qvx b = qvy.b();
        b.a = new rte(str, 2);
        return s(b.a());
    }

    public final rve B(final String str, final int i, final String[] strArr, final byte[] bArr) {
        qvx b = qvy.b();
        b.a = new qvo() { // from class: rth
            @Override // defpackage.qvo
            public final void a(Object obj, Object obj2) {
                String str2 = str;
                int i2 = i;
                String[] strArr2 = strArr;
                byte[] bArr2 = bArr;
                rtj rtjVar = new rtj((rvh) obj2);
                rtk rtkVar = (rtk) ((rtl) obj).D();
                Parcel pv = rtkVar.pv();
                dve.i(pv, rtjVar);
                pv.writeString(str2);
                pv.writeInt(i2);
                pv.writeStringArray(strArr2);
                pv.writeByteArray(bArr2);
                rtkVar.px(1, pv);
            }
        };
        return s(b.a());
    }

    public final rve C(String str, String str2) {
        qvx b = qvy.b();
        b.a = new rtf(str, str2, 1);
        return s(b.a());
    }

    @Override // defpackage.qsy
    public final qtp o() {
        return this.A;
    }

    public final qvd p(Object obj, String str) {
        return tgo.o(obj, this.B, str);
    }

    public final qws q() {
        Set emptySet;
        GoogleSignInAccount a;
        qws qwsVar = new qws();
        qsm qsmVar = this.z;
        Account account = null;
        if (!(qsmVar instanceof qsk) || (a = ((qsk) qsmVar).a()) == null) {
            qsm qsmVar2 = this.z;
            if (qsmVar2 instanceof qsj) {
                account = ((qsj) qsmVar2).a();
            }
        } else {
            String str = a.d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        qwsVar.a = account;
        qsm qsmVar3 = this.z;
        if (qsmVar3 instanceof qsk) {
            GoogleSignInAccount a2 = ((qsk) qsmVar3).a();
            if (a2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = a2.a();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (qwsVar.b == null) {
            qwsVar.b = new afy();
        }
        qwsVar.b.addAll(emptySet);
        qwsVar.d = this.w.getClass().getName();
        qwsVar.c = this.w.getPackageName();
        return qwsVar;
    }

    public final rve r(qvy qvyVar) {
        return a(2, qvyVar);
    }

    public final rve s(qvy qvyVar) {
        return a(0, qvyVar);
    }

    public final rve t(qvn qvnVar) {
        qnm.n(qvnVar.a.a(), "Listener has already been released.");
        quq quqVar = this.E;
        qvj qvjVar = qvnVar.a;
        qwb qwbVar = qvnVar.b;
        Runnable runnable = qvnVar.c;
        rvh rvhVar = new rvh();
        quqVar.d(rvhVar, qvjVar.c, this);
        qtl qtlVar = new qtl(new qvk(qvjVar, qwbVar, runnable), rvhVar);
        Handler handler = quqVar.o;
        handler.sendMessage(handler.obtainMessage(8, new qvi(qtlVar, quqVar.k.get(), this)));
        return rvhVar.a;
    }

    public final rve u(qvb qvbVar, int i) {
        quq quqVar = this.E;
        rvh rvhVar = new rvh();
        quqVar.d(rvhVar, i, this);
        qtn qtnVar = new qtn(qvbVar, rvhVar);
        Handler handler = quqVar.o;
        handler.sendMessage(handler.obtainMessage(13, new qvi(qtnVar, quqVar.k.get(), this)));
        return rvhVar.a;
    }

    public final rve v(qvy qvyVar) {
        return a(1, qvyVar);
    }

    public final void w(int i, qtt qttVar) {
        boolean z = true;
        if (!qttVar.i && !((Boolean) BasePendingResult.e.get()).booleanValue()) {
            z = false;
        }
        qttVar.i = z;
        quq quqVar = this.E;
        qtk qtkVar = new qtk(i, qttVar);
        Handler handler = quqVar.o;
        handler.sendMessage(handler.obtainMessage(4, new qvi(qtkVar, quqVar.k.get(), this)));
    }

    public final void x(FeedbackOptions feedbackOptions) {
        tnk.i(rbh.c(this.D, feedbackOptions));
    }

    public final rve y() {
        qvx b = qvy.b();
        b.a = new qvo() { // from class: rfq
            @Override // defpackage.qvo
            public final void a(Object obj, Object obj2) {
                Location location;
                rgr rgrVar = (rgr) obj;
                String str = qst.this.x;
                Feature[] y = rgrVar.y();
                if (y != null && tqn.h(y, rfo.c)) {
                    rgq rgqVar = rgrVar.b;
                    rgqVar.e.a();
                    rgn b2 = rgqVar.e.b();
                    Parcel pv = b2.pv();
                    pv.writeString(str);
                    Parcel pw = b2.pw(80, pv);
                    location = (Location) dve.a(pw, Location.CREATOR);
                    pw.recycle();
                } else {
                    rgq rgqVar2 = rgrVar.b;
                    rgqVar2.e.a();
                    rgn b3 = rgqVar2.e.b();
                    Parcel pw2 = b3.pw(7, b3.pv());
                    location = (Location) dve.a(pw2, Location.CREATOR);
                    pw2.recycle();
                }
                ((rvh) obj2).b(location);
            }
        };
        b.c = 2414;
        return s(b.a());
    }

    public final void z(rgf rgfVar) {
        u(tgo.n(rgfVar, rgf.class.getSimpleName()), 0).a(new qvz());
    }

    public qst(Context context, qso qsoVar, qsm qsmVar, qss qssVar) {
        this(context, null, qsoVar, qsmVar, qssVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qst(android.content.Context r2, defpackage.qso r3, defpackage.qsm r4, defpackage.qvs r5) {
        /*
            r1 = this;
            qsr r0 = new qsr
            r0.<init>()
            r0.b(r5)
            qss r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qst.<init>(android.content.Context, qso, qsm, qvs):void");
    }

    public qst(Context context) {
        this(context, rbh.b, qsm.f, qss.a);
        rxq.b(context.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qst(android.content.Context r6, byte[] r7) {
        /*
            r5 = this;
            qso r7 = defpackage.anxc.a
            qsl r0 = defpackage.qsm.f
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            anwi r2 = new anwi
            r2.<init>()
            qsr r3 = new qsr
            r3.<init>()
            java.lang.String r4 = "Looper must not be null."
            defpackage.qnm.n(r1, r4)
            r3.a = r1
            r3.b(r2)
            qss r1 = r3.a()
            r5.<init>(r6, r7, r0, r1)
            defpackage.vbt.e(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qst.<init>(android.content.Context, byte[]):void");
    }
}
