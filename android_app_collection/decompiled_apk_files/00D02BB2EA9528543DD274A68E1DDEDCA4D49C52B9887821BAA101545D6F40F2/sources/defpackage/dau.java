package defpackage;

import android.app.Application;
import java.io.File;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dau  reason: default package */
/* loaded from: classes5.dex */
public final class dau implements dfeg {
    public static final dbtm a = dbtm.a('/');
    public final cvin b;
    public final dehp c;
    private final dehn<File> d;
    private final ckcw e;

    public dau(final Application application, cvin cvinVar, ckcw ckcwVar, dehp dehpVar) {
        this.b = cvinVar;
        this.e = ckcwVar;
        this.c = dehpVar;
        this.d = dehpVar.c(new Callable(application) { // from class: daq
            private final Application a;

            {
                this.a = application;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Application application2 = this.a;
                dbtm dbtmVar = dau.a;
                File file = new File(application2.getCacheDir(), "arlo_asset_cache");
                file.mkdirs();
                return file;
            }
        });
    }

    @Override // defpackage.dfeg
    public final dehn<dffy> a(final dffu dffuVar) {
        return deew.g(this.d, new defg(this, dffuVar) { // from class: dar
            private final dau a;
            private final dffu b;

            {
                this.a = this;
                this.b = dffuVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dau dauVar = this.a;
                dffu dffuVar2 = this.b;
                File file = (File) obj;
                dccx F = dcdc.F();
                for (dfft dfftVar : dffuVar2.a) {
                    dffw bZ = dffx.e.bZ();
                    String str = dfftVar.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dffx dffxVar = (dffx) bZ.b;
                    str.getClass();
                    dffxVar.a |= 1;
                    dffxVar.d = str;
                    String replace = dfftVar.a.replace('/', '_');
                    String str2 = (String) dcft.s(dau.a.g(dfftVar.b));
                    File file2 = new File(file, replace);
                    if (file2.exists() && !file2.isDirectory()) {
                        file2.delete();
                    }
                    file2.mkdirs();
                    File file3 = new File(file2, str2);
                    if (!file3.exists()) {
                        String str3 = dfftVar.b;
                        deig d = deig.d();
                        cvie a2 = dauVar.b.a(str3, file2, String.valueOf(file3.getName()).concat(".inprogress"), new dat(dauVar, file3, d, bZ));
                        a2.f(cvid.WIFI_OR_CELLULAR);
                        a2.d();
                        F.g(d);
                    } else {
                        String absolutePath = file3.getAbsolutePath();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dffx dffxVar2 = (dffx) bZ.b;
                        absolutePath.getClass();
                        dffxVar2.b = 2;
                        dffxVar2.c = absolutePath;
                        F.g(deha.a(bZ.bK()));
                    }
                }
                final dcdc f = F.f();
                return deha.l(f).b(new Callable(f) { // from class: das
                    private final dcdc a;

                    {
                        this.a = f;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dcdc dcdcVar = this.a;
                        dbtm dbtmVar = dau.a;
                        dffv bZ2 = dffy.b.bZ();
                        int size = dcdcVar.size();
                        for (int i = 0; i < size; i++) {
                            dffx dffxVar3 = (dffx) deha.r((dehn) dcdcVar.get(i));
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dffy dffyVar = (dffy) bZ2.b;
                            dffxVar3.getClass();
                            dsrj<dffx> dsrjVar = dffyVar.a;
                            if (!dsrjVar.a()) {
                                dffyVar.a = dsqw.cl(dsrjVar);
                            }
                            dffyVar.a.add(dffxVar3);
                        }
                        return bZ2.bK();
                    }
                }, dauVar.c);
            }
        }, this.c);
    }

    public final void b(int i) {
        this.e.s(ckdi.a, i);
    }
}
