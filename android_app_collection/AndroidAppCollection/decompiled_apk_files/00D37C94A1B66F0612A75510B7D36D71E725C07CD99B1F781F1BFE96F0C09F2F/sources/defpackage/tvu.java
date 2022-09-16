package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tvu  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tvu implements ampg {
    public final /* synthetic */ List a;
    private final /* synthetic */ int b;

    public /* synthetic */ tvu(List list) {
        this.a = list;
    }

    public /* synthetic */ tvu(List list, int i) {
        this.b = i;
        this.a = list;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            Void r7 = (Void) obj;
            return this.a;
        } else if (i == 1) {
            List list = this.a;
            Uri uri = (Uri) obj;
            if (uri == null) {
                return null;
            }
            list.add(uri);
            return null;
        } else if (i == 2) {
            List<tqv> list2 = this.a;
            aopa mo52toBuilder = ((tqt) obj).mo52toBuilder();
            for (tqv tqvVar : list2) {
                String str = tqvVar.c;
                String str2 = tqvVar.d;
                int i2 = typ.a;
                mo52toBuilder.z(tzh.k(tqvVar));
            }
            return (tqt) mo52toBuilder.mo39build();
        } else if (i == 3) {
            List list3 = this.a;
            tqt tqtVar = (tqt) obj;
            aopa mo52toBuilder2 = tqtVar.mo52toBuilder();
            for (Map.Entry entry : Collections.unmodifiableMap(tqtVar.b).entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    list3.add(Pair.create(tzh.i(str3), (tqm) entry.getValue()));
                } catch (tzd e) {
                    mo52toBuilder2.z(str3);
                    String valueOf = String.valueOf(str3);
                    typ.i(e, valueOf.length() != 0 ? "Failed to deserialized file group key: ".concat(valueOf) : new String("Failed to deserialized file group key: "));
                }
            }
            return (tqt) mo52toBuilder2.mo39build();
        } else if (i == 4) {
            List list4 = this.a;
            aopa mo52toBuilder3 = ((tqt) obj).mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            tqt tqtVar2 = (tqt) mo52toBuilder3.instance;
            aopu aopuVar = tqtVar2.d;
            if (!aopuVar.c()) {
                tqtVar2.d = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list4, (List) tqtVar2.d);
            return (tqt) mo52toBuilder3.mo39build();
        } else if (i == 5) {
            Void r72 = (Void) obj;
            return this.a;
        } else {
            List list5 = this.a;
            aopa mo52toBuilder4 = ((awuj) obj).mo52toBuilder();
            aopa createBuilder = afkr.a.createBuilder();
            createBuilder.copyOnWrite();
            afkr afkrVar = (afkr) createBuilder.instance;
            aopu aopuVar2 = afkrVar.b;
            if (!aopuVar2.c()) {
                afkrVar.b = aopi.mutableCopy(aopuVar2);
            }
            aonk.addAll((Iterable) list5, (List) afkrVar.b);
            afkr afkrVar2 = (afkr) createBuilder.mo39build();
            mo52toBuilder4.copyOnWrite();
            awuj awujVar = (awuj) mo52toBuilder4.instance;
            afkrVar2.getClass();
            awujVar.e = afkrVar2;
            awujVar.b |= 2;
            return (awuj) mo52toBuilder4.mo39build();
        }
    }
}
