package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: tsl  reason: default package */
/* loaded from: classes4.dex */
public final class tsl implements tsh {
    public final ubt a;
    private final Context b;
    private final vjb c;

    public tsl(Context context, ubt ubtVar, vjb vjbVar) {
        this.b = context;
        this.a = ubtVar;
        this.c = vjbVar;
    }

    @Override // defpackage.tsh
    public final ankt a(final tsg tsgVar) {
        char c;
        File c2;
        final String lastPathSegment = tsgVar.a.getLastPathSegment();
        lastPathSegment.getClass();
        try {
            Context context = this.b;
            Uri uri = tsgVar.a;
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            if (hashCode != -861391249) {
                if (hashCode == 3143036 && scheme.equals("file")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (scheme.equals("android")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                c2 = uwv.c(uri, context);
            } else if (c == 1) {
                c2 = uxe.h(uri);
            } else {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Couldn't convert URI to path: ");
                sb.append(valueOf);
                throw new vjt(sb.toString());
            }
            final File parentFile = c2.getParentFile();
            parentFile.getClass();
            try {
                final vkd vkdVar = (vkd) this.c.c(tsgVar.a, new vkg(1));
                return aed.c(new agr() { // from class: tsj
                    @Override // defpackage.agr
                    public final Object a(agp agpVar) {
                        final tsl tslVar = tsl.this;
                        tsg tsgVar2 = tsgVar;
                        final File file = parentFile;
                        final String str = lastPathSegment;
                        ubm ubmVar = new ubm(tslVar.a, tsgVar2.b, file, str, new tsi(agpVar), vkdVar);
                        ubmVar.m = null;
                        if (tse.c == tsgVar2.c) {
                            ubmVar.e(ubl.WIFI_OR_CELLULAR);
                        } else {
                            ubmVar.e(ubl.WIFI_ONLY);
                        }
                        int i = tsgVar2.d;
                        if (i > 0) {
                            ubmVar.i = i;
                        }
                        amuk amukVar = tsgVar2.e;
                        int i2 = ((amxx) amukVar).c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            Pair pair = (Pair) amukVar.get(i3);
                            ubmVar.e.p((String) pair.first, (String) pair.second);
                        }
                        agpVar.a(new Runnable() { // from class: tsk
                            @Override // java.lang.Runnable
                            public final void run() {
                                tsl tslVar2 = tsl.this;
                                tslVar2.a.d(file, str);
                            }
                        }, anjk.a);
                        ubmVar.d.l(ubmVar);
                        int i4 = typ.a;
                        String valueOf2 = String.valueOf(tsgVar2.b);
                        return valueOf2.length() != 0 ? "Data download scheduled for file ".concat(valueOf2) : new String("Data download scheduled for file ");
                    }
                });
            } catch (IOException e) {
                typ.f(e, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", tsgVar.a);
                tpy a = tqa.a();
                a.a = tpz.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                a.c = e;
                return anlz.p(a.a());
            }
        } catch (IOException e2) {
            typ.d("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", tsgVar.a);
            tpy a2 = tqa.a();
            a2.a = tpz.MALFORMED_FILE_URI_ERROR;
            a2.c = e2;
            return anlz.p(a2.a());
        }
    }
}
