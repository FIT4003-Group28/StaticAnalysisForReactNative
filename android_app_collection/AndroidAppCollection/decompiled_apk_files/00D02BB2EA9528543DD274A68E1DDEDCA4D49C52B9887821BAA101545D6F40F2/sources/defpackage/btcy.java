package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: btcy  reason: default package */
/* loaded from: classes4.dex */
public final class btcy implements Runnable {
    private final dali a;
    private final btvo b;
    private final bvjj c;
    private final ckcw d;

    public btcy(Context context, btvo btvoVar, ckcw ckcwVar, bvjj bvjjVar) {
        this.a = dalj.a(context);
        this.b = btvoVar;
        this.c = bvjjVar;
        this.d = ckcwVar;
    }

    private final List<Locale> a() {
        Set<String> C = this.c.C(bvjk.S, new HashSet());
        C.remove(Locale.getDefault().getLanguage());
        ArrayList arrayList = new ArrayList();
        for (String str : C) {
            dbsg<Locale> b = btbp.b(str);
            if (b.a()) {
                arrayList.add(b.b());
            }
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dkmw dkmwVar = this.b.getLanguageSettingParameters().g;
        if (dkmwVar == null) {
            dkmwVar = dkmw.d;
        }
        boolean z = dkmwVar.a;
        dkmw dkmwVar2 = this.b.getLanguageSettingParameters().g;
        if (dkmwVar2 == null) {
            dkmwVar2 = dkmw.d;
        }
        boolean z2 = dkmwVar2.c;
        ArrayList<Locale> arrayList = new ArrayList();
        Set<String> d = this.a.d();
        dkmw dkmwVar3 = this.b.getLanguageSettingParameters().g;
        if (dkmwVar3 == null) {
            dkmwVar3 = dkmw.d;
        }
        for (String str : dkmwVar3.b) {
            dbsg<Locale> b = btbp.b(str);
            if (b.a() && !d.contains(str) && !a().contains(b.b())) {
                arrayList.add(b.b());
            }
        }
        if (z && !arrayList.isEmpty()) {
            for (Locale locale : arrayList) {
                ((ckco) this.d.a(ckfr.a)).a(btbz.a(locale) - 1);
            }
            this.a.b(arrayList);
            HashSet hashSet = new HashSet(this.c.C(bvjk.S, dcmr.a));
            for (Locale locale2 : arrayList) {
                hashSet.add(locale2.getLanguage());
            }
            this.c.af(bvjk.S, hashSet);
        }
        List<Locale> a = a();
        if (!z2 || a.isEmpty()) {
            return;
        }
        this.a.c(a);
        this.c.P(bvjk.S);
    }
}
