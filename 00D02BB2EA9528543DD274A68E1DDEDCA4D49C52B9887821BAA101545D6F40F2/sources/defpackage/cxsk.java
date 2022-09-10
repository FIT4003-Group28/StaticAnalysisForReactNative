package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cxsk  reason: default package */
/* loaded from: classes5.dex */
public final class cxsk {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"PEOPLE_AUTOCOMPLETE", "PHOTOS", "PHOTOS_ANDROID_PRIMES", "SENDKIT", "SOCIAL_AFFINITY", "SOCIAL_AFFINITY_PHOTOS"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        return dbrz.e("").i("com.google.android.libraries.social.peoplekit#", str, ".client_id:", str2);
    }

    public static final void b(final Context context, dehp dehpVar, final String str, final String str2, @dzsi cxsl cxslVar) {
        final coxz a2 = coxs.a(context);
        final String packageName = context.getPackageName();
        deew.h(csac.a(a2.a(a(packageName, str), cxslVar == null ? 0 : 341506552, b, null)), new dbrn(context, a2, packageName, str, str2) { // from class: cxsh
            private final Context a;
            private final coxz b;
            private final String c;
            private final String d;
            private final String e;

            {
                this.a = context;
                this.b = a2;
                this.c = packageName;
                this.d = str;
                this.e = str2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cpcq b2;
                Context context2 = this.a;
                coxz coxzVar = this.b;
                String str3 = this.c;
                String str4 = this.d;
                String str5 = this.e;
                Void r7 = (Void) obj;
                String a3 = cxsk.a(str3, str4);
                if (cnmr.d.j(coxzVar.b, 12451000) == 0) {
                    cntc builder = cntd.builder();
                    builder.a = new cnsr(a3, str5) { // from class: coxx
                        private final String a;
                        private final String b;

                        {
                            this.a = a3;
                            this.b = str5;
                        }

                        @Override // defpackage.cnsr
                        public final void a(Object obj2, Object obj3) {
                            String str6 = this.a;
                            String str7 = this.b;
                            coxy coxyVar = new coxy((cpct) obj3);
                            StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 9 + String.valueOf(str6).length());
                            sb.append("CURRENT:");
                            sb.append(str7);
                            sb.append(":");
                            sb.append(str6);
                            ((coyi) ((coyj) obj2).L()).g(coxyVar, sb.toString());
                        }
                    };
                    b2 = coxzVar.c(builder.a());
                } else {
                    b2 = cpda.b(new cnob(new Status(16)));
                }
                b2.s(new cxsj(coxzVar, a3, context2, str5));
                return null;
            }
        }, dehpVar);
    }
}
