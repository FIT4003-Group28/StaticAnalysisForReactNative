package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cyhz  reason: default package */
/* loaded from: classes5.dex */
public final class cyhz implements cyib {
    public static final String a = String.format("phenotype__%s", "com.google.android.libraries.social.populous");
    public final Context b;
    public final String c;
    private final dbty<coxz> d;

    public cyhz(Context context, dbty<coxz> dbtyVar) {
        this.b = context;
        this.c = String.format("%s#%s", "com.google.android.libraries.social.populous", context.getPackageName());
        this.d = dbtyVar;
    }

    @Override // defpackage.cyib
    public final dehn<Void> a(ClientConfigInternal clientConfigInternal, dehp dehpVar) {
        cxju.c(this.b);
        coxz c = c();
        String str = this.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(clientConfigInternal.u.s);
        arrayList.add(clientConfigInternal.v.s);
        arrayList.add(cyfk.SENDKIT.s);
        dcpd<cyfk> it = clientConfigInternal.w.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().s);
        }
        return csac.a(c.a(str, 341506552, (String[]) arrayList.toArray(new String[0]), null));
    }

    @Override // defpackage.cyib
    public final dehn<Void> b(final String str, dehp dehpVar) {
        return ajd.a(new aja(this, str) { // from class: cyhx
            private final cyhz a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.aja
            public final Object a(final aiy aiyVar) {
                cyhz cyhzVar = this.a;
                new coyf(cyhzVar.c(), cyhzVar.c, cyhzVar.b.getSharedPreferences(cyhz.a, 0)).d(this.b, new coyd(aiyVar) { // from class: cyhy
                    private final aiy a;

                    {
                        this.a = aiyVar;
                    }

                    @Override // defpackage.coyd
                    public final void a(boolean z) {
                        aiy aiyVar2 = this.a;
                        String str2 = cyhz.a;
                        if (!z) {
                            aiyVar2.c(new cyia("commitForUser failed."));
                        } else {
                            aiyVar2.b(null);
                        }
                    }
                });
                return null;
            }
        });
    }

    public final coxz c() {
        return this.d.a();
    }
}
