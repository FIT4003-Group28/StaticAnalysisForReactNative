package defpackage;

import android.os.Bundle;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: desc  reason: default package */
/* loaded from: classes6.dex */
public final class desc {
    public final Map<Pair<String, String>, cpcq<derw>> a = new aif();
    private final Executor b;

    public desc(Executor executor) {
        this.b = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized cpcq<derw> a(String str, String str2, ders dersVar) {
        final Pair<String, String> pair = new Pair<>(str, str2);
        cpcq<derw> cpcqVar = this.a.get(pair);
        if (cpcqVar != null) {
            return cpcqVar;
        }
        final FirebaseInstanceId firebaseInstanceId = dersVar.a;
        final String str3 = dersVar.b;
        final String str4 = dersVar.c;
        final String str5 = dersVar.d;
        derv dervVar = firebaseInstanceId.f;
        cpcq<derw> h = dervVar.b(dervVar.a(str3, str4, str5, new Bundle())).j(firebaseInstanceId.c, new cpcp(firebaseInstanceId, str4, str5, str3) { // from class: dert
            private final FirebaseInstanceId a;
            private final String b;
            private final String c;
            private final String d;

            {
                this.a = firebaseInstanceId;
                this.b = str4;
                this.c = str5;
                this.d = str3;
            }

            @Override // defpackage.cpcp
            public final cpcq a(Object obj) {
                FirebaseInstanceId firebaseInstanceId2 = this.a;
                String str6 = this.b;
                String str7 = this.c;
                String str8 = this.d;
                String str9 = (String) obj;
                FirebaseInstanceId.a.d(firebaseInstanceId2.k(), str6, str7, str9, firebaseInstanceId2.e.c());
                return cpda.a(new derw(str8, str9));
            }
        }).h(this.b, new cpbu(this, pair) { // from class: desb
            private final desc a;
            private final Pair b;

            {
                this.a = this;
                this.b = pair;
            }

            @Override // defpackage.cpbu
            public final Object a(cpcq cpcqVar2) {
                desc descVar = this.a;
                Pair pair2 = this.b;
                synchronized (descVar) {
                    descVar.a.remove(pair2);
                }
                return cpcqVar2;
            }
        });
        this.a.put(pair, h);
        return h;
    }
}
