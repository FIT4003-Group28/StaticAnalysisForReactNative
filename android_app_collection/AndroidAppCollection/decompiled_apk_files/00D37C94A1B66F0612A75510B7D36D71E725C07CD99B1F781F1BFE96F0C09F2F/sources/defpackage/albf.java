package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: albf  reason: default package */
/* loaded from: classes.dex */
public final class albf {
    public final Executor a;
    public final acrr b;
    public final afvn c;
    private final Context d;
    private final SharedPreferences e;
    private final String f;

    public albf(Context context, Executor executor, acrr acrrVar, afvn afvnVar, SharedPreferences sharedPreferences) {
        this.d = context;
        this.a = executor;
        this.b = acrrVar;
        this.e = sharedPreferences;
        this.c = afvnVar;
        String string = context.getString(R.string.upload_network_policy_pref_value_wifi);
        zgh.m(string);
        this.f = string;
    }

    public final avtw a(String str) {
        NetworkInfo activeNetworkInfo;
        aopa createBuilder = avtw.a.createBuilder();
        createBuilder.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder.instance;
        str.getClass();
        avtwVar.b |= 1;
        avtwVar.c = str;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.d.getSystemService("connectivity");
        int i = 2;
        int i2 = 7;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    i2 = 2;
                } else if (type != 4) {
                    i2 = type != 9 ? type != 6 ? type != 7 ? 3 : 21 : 20 : 22;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 17;
                    break;
                case 4:
                    break;
                case 5:
                    i2 = 9;
                    break;
                case 6:
                    i2 = 10;
                    break;
                case 7:
                    i2 = 6;
                    break;
                case 8:
                    i2 = 12;
                    break;
                case 9:
                    i2 = 15;
                    break;
                case 10:
                    i2 = 13;
                    break;
                case 11:
                    i2 = 16;
                    break;
                case 12:
                    i2 = 11;
                    break;
                case 13:
                    i2 = 18;
                    break;
                case 14:
                    i2 = 8;
                    break;
                case 15:
                    i2 = 14;
                    break;
                default:
                    i2 = 19;
                    break;
            }
        } else {
            i2 = 1;
        }
        createBuilder.copyOnWrite();
        avtw avtwVar2 = (avtw) createBuilder.instance;
        avtwVar2.e = i2 - 1;
        avtwVar2.b |= 8;
        if (true == this.f.equals(this.e.getString(ymf.UPLOAD_NETWORK_POLICY, null))) {
            i = 3;
        }
        createBuilder.copyOnWrite();
        avtw avtwVar3 = (avtw) createBuilder.instance;
        avtwVar3.d = i - 1;
        avtwVar3.b |= 4;
        return (avtw) createBuilder.mo39build();
    }

    public final void b(final String str, final arrh arrhVar) {
        this.a.execute(new Runnable() { // from class: albe
            @Override // java.lang.Runnable
            public final void run() {
                afvm d;
                albf albfVar = albf.this;
                String str2 = str;
                arrh arrhVar2 = arrhVar;
                if (TextUtils.isEmpty(str2)) {
                    d = albfVar.c.c();
                } else {
                    d = albfVar.c.d(str2);
                }
                if (d == null) {
                    String valueOf = String.valueOf(arrhVar2);
                    String.valueOf(str2).length();
                    String.valueOf(valueOf).length();
                    return;
                }
                albfVar.b.g(arrhVar2, d);
            }
        });
    }

    public final void c(String str, String str2, long j, long j2, long j3, long j4, long j5) {
        avtu a = avtv.a();
        avul avulVar = avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_COPIED_FILE_CHUNK;
        a.copyOnWrite();
        avtv.d((avtv) a.instance, avulVar);
        aopa createBuilder = avtw.a.createBuilder();
        createBuilder.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder.instance;
        str.getClass();
        avtwVar.b |= 1;
        avtwVar.c = str;
        a.copyOnWrite();
        avtv.c((avtv) a.instance, (avtw) createBuilder.mo39build());
        a.copyOnWrite();
        avtv.j((avtv) a.instance, j);
        a.copyOnWrite();
        avtv.m((avtv) a.instance, j2);
        a.copyOnWrite();
        avtv.n((avtv) a.instance, j3);
        a.copyOnWrite();
        avtv.o((avtv) a.instance, j4);
        a.copyOnWrite();
        avtv.p((avtv) a.instance, j5);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dR((avtv) a.mo39build());
        b(str2, (arrh) a2.mo39build());
    }

    public final void d(String str, String str2, avul avulVar) {
        avtu a = avtv.a();
        a.copyOnWrite();
        avtv.d((avtv) a.instance, avulVar);
        aopa createBuilder = avtw.a.createBuilder();
        createBuilder.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder.instance;
        str.getClass();
        avtwVar.b |= 1;
        avtwVar.c = str;
        a.copyOnWrite();
        avtv.c((avtv) a.instance, (avtw) createBuilder.mo39build());
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dR((avtv) a.mo39build());
        b(str2, (arrh) a2.mo39build());
    }

    public final void e(String str, String str2, avum avumVar) {
        avtu a = avtv.a();
        avul avulVar = avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_ABANDONED;
        a.copyOnWrite();
        avtv.d((avtv) a.instance, avulVar);
        aopa createBuilder = avtw.a.createBuilder();
        createBuilder.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder.instance;
        str.getClass();
        avtwVar.b |= 1;
        avtwVar.c = str;
        a.copyOnWrite();
        avtv.c((avtv) a.instance, (avtw) createBuilder.mo39build());
        a.copyOnWrite();
        avtv.l((avtv) a.instance, avumVar);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dR((avtv) a.mo39build());
        b(str2, (arrh) a2.mo39build());
    }

    public final void f(String str, avug avugVar) {
        avtu a = avtv.a();
        avul avulVar = avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CREATION_WARNING;
        a.copyOnWrite();
        avtv.d((avtv) a.instance, avulVar);
        aopa createBuilder = avtw.a.createBuilder();
        createBuilder.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder.instance;
        str.getClass();
        avtwVar.b |= 1;
        avtwVar.c = str;
        a.copyOnWrite();
        avtv.c((avtv) a.instance, (avtw) createBuilder.mo39build());
        a.copyOnWrite();
        avtv.g((avtv) a.instance, avugVar);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dR((avtv) a.mo39build());
        this.a.execute(new albd(this, (arrh) a2.mo39build()));
    }

    public final void g(String str, String str2, avug avugVar) {
        avtu a = avtv.a();
        avul avulVar = avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_FAILED;
        a.copyOnWrite();
        avtv.d((avtv) a.instance, avulVar);
        aopa createBuilder = avtw.a.createBuilder();
        createBuilder.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder.instance;
        str.getClass();
        avtwVar.b |= 1;
        avtwVar.c = str;
        a.copyOnWrite();
        avtv.c((avtv) a.instance, (avtw) createBuilder.mo39build());
        a.copyOnWrite();
        avtv.g((avtv) a.instance, avugVar);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dR((avtv) a.mo39build());
        b(str2, (arrh) a2.mo39build());
    }

    public final void h(String str, avul avulVar, avuk avukVar) {
        avtu a = avtv.a();
        a.copyOnWrite();
        avtv.d((avtv) a.instance, avulVar);
        a.copyOnWrite();
        avtv.h((avtv) a.instance, avukVar);
        aopa createBuilder = avtw.a.createBuilder();
        createBuilder.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder.instance;
        str.getClass();
        avtwVar.b |= 1;
        avtwVar.c = str;
        a.copyOnWrite();
        avtv.c((avtv) a.instance, (avtw) createBuilder.mo39build());
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dR((avtv) a.mo39build());
        b(null, (arrh) a2.mo39build());
    }

    public final void i(String str, avul avulVar, int i, boolean z) {
        aopa createBuilder = avud.a.createBuilder();
        aopa createBuilder2 = avtt.a.createBuilder();
        createBuilder2.copyOnWrite();
        avtt avttVar = (avtt) createBuilder2.instance;
        avttVar.d = i - 1;
        avttVar.b |= 2;
        createBuilder2.copyOnWrite();
        avtt avttVar2 = (avtt) createBuilder2.instance;
        avttVar2.b |= 4;
        avttVar2.e = z;
        avtt avttVar3 = (avtt) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        avud avudVar = (avud) createBuilder.instance;
        avttVar3.getClass();
        avudVar.c = avttVar3;
        avudVar.b |= 1;
        avtu a = avtv.a();
        a.copyOnWrite();
        avtv.d((avtv) a.instance, avulVar);
        a.copyOnWrite();
        avtv.r((avtv) a.instance, (avud) createBuilder.mo39build());
        aopa createBuilder3 = avtw.a.createBuilder();
        createBuilder3.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder3.instance;
        avtwVar.b |= 1;
        avtwVar.c = str;
        a.copyOnWrite();
        avtv.c((avtv) a.instance, (avtw) createBuilder3.mo39build());
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dR((avtv) a.mo39build());
        this.a.execute(new albd(this, (arrh) a2.mo39build(), 1));
    }

    public final void j(String str, String str2, avuk avukVar, int i, boolean z, avuj[] avujVarArr) {
        avtu a = avtv.a();
        avul avulVar = avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CONFIRMED;
        a.copyOnWrite();
        avtv.d((avtv) a.instance, avulVar);
        aopa createBuilder = avtw.a.createBuilder();
        createBuilder.copyOnWrite();
        avtw avtwVar = (avtw) createBuilder.instance;
        str.getClass();
        avtwVar.b |= 1;
        avtwVar.c = str;
        a.copyOnWrite();
        avtv.c((avtv) a.instance, (avtw) createBuilder.mo39build());
        aopa createBuilder2 = avud.a.createBuilder();
        aopa createBuilder3 = avtt.a.createBuilder();
        createBuilder3.copyOnWrite();
        avtt avttVar = (avtt) createBuilder3.instance;
        avttVar.c = avukVar.k;
        avttVar.b |= 1;
        createBuilder3.copyOnWrite();
        avtt avttVar2 = (avtt) createBuilder3.instance;
        int i2 = i - 1;
        if (i != 0) {
            avttVar2.d = i2;
            avttVar2.b |= 2;
            createBuilder3.copyOnWrite();
            avtt avttVar3 = (avtt) createBuilder3.instance;
            avttVar3.b |= 4;
            avttVar3.e = z;
            createBuilder2.copyOnWrite();
            avud avudVar = (avud) createBuilder2.instance;
            avtt avttVar4 = (avtt) createBuilder3.mo39build();
            avttVar4.getClass();
            avudVar.c = avttVar4;
            avudVar.b |= 1;
            List<avuj> asList = Arrays.asList(avujVarArr);
            createBuilder2.copyOnWrite();
            avud avudVar2 = (avud) createBuilder2.instance;
            aopq aopqVar = avudVar2.d;
            if (!aopqVar.c()) {
                avudVar2.d = aopi.mutableCopy(aopqVar);
            }
            for (avuj avujVar : asList) {
                avudVar2.d.g(avujVar.i);
            }
            a.copyOnWrite();
            avtv.r((avtv) a.instance, (avud) createBuilder2.mo39build());
            arrf a2 = arrh.a();
            a2.copyOnWrite();
            ((arrh) a2.instance).dR((avtv) a.mo39build());
            b(str2, (arrh) a2.mo39build());
            return;
        }
        throw null;
    }
}
