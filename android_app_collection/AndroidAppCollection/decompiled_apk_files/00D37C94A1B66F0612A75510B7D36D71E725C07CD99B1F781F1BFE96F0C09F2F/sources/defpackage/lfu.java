package defpackage;

import android.content.SharedPreferences;
import android.text.Spanned;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import com.google.android.apps.youtube.app.settings.IntListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: lfu  reason: default package */
/* loaded from: classes3.dex */
public final class lfu {
    public static final /* synthetic */ int a = 0;
    private static final amup b = amup.m("1", "2", "2", "1", "3", "0");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(aadd aaddVar, IntListPreference intListPreference, Object obj) {
        if (!(obj instanceof aurt)) {
            return;
        }
        lft e = e((aurt) obj);
        f(intListPreference, aaddVar, e);
        intListPreference.G = e.c;
    }

    public static void b(aadd aaddVar, final ProtoDataStoreListPreference protoDataStoreListPreference, Object obj, final acth acthVar) {
        if (!(obj instanceof aurt)) {
            return;
        }
        final lft e = e((aurt) obj);
        f(protoDataStoreListPreference, aaddVar, e);
        protoDataStoreListPreference.n((CharSequence) e.c.get(String.valueOf(fyx.a(aaddVar))));
        protoDataStoreListPreference.G = new zcn() { // from class: lfs
            @Override // defpackage.zcn
            public final void a(Object obj2) {
                acth acthVar2 = acth.this;
                ProtoDataStoreListPreference protoDataStoreListPreference2 = protoDataStoreListPreference;
                lft lftVar = e;
                String str = (String) obj2;
                int i = lfu.a;
                lfu.c(zgh.b(str, -1), acthVar2);
                protoDataStoreListPreference2.n((CharSequence) lftVar.c.get(str));
            }
        };
    }

    public static void c(int i, acth acthVar) {
        acti oi = acthVar.oi();
        oi.D(new acte(actj.INLINE_DIALOG_SETTINGS_ON));
        oi.D(new acte(actj.INLINE_DIALOG_SETTINGS_ONLY_WIFI));
        oi.D(new acte(actj.INLINE_DIALOG_SETTINGS_OFF));
        if (i == 0) {
            oi.H(3, new acte(actj.INLINE_DIALOG_SETTINGS_OFF), null);
        } else if (i == 2) {
            oi.H(3, new acte(actj.INLINE_DIALOG_SETTINGS_ON), null);
        } else if (i != 1) {
        } else {
            oi.H(3, new acte(actj.INLINE_DIALOG_SETTINGS_ONLY_WIFI), null);
        }
    }

    public static void d(SharedPreferences sharedPreferences, acth acthVar) {
        c(sharedPreferences.getInt("inline_global_play_pause", -1), acthVar);
    }

    private static lft e(aurt aurtVar) {
        arag aragVar;
        auro auroVar;
        int size = aurtVar.f.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < size; i++) {
            aurp aurpVar = (aurp) aurtVar.f.get(i);
            if (aurpVar.b == 64166933) {
                auroVar = (auro) aurpVar.c;
            } else {
                auroVar = auro.a;
            }
            arrayList.add(auroVar.c);
            arrayList2.add((CharSequence) b.get(auroVar.e));
            if ((auroVar.b & 2) != 0) {
                hashMap.put((CharSequence) arrayList2.get(i), auroVar.d);
            }
        }
        arag aragVar2 = null;
        if ((aurtVar.b & 2) != 0) {
            aragVar = aurtVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b2 = ajgl.b(aragVar);
        if ((aurtVar.b & 4) != 0 && (aragVar2 = aurtVar.e) == null) {
            aragVar2 = arag.a;
        }
        return new lft(b2, ajgl.b(aragVar2), amup.j(hashMap), amuk.o(arrayList), amuk.o(arrayList2));
    }

    private static void f(ListPreference listPreference, aadd aaddVar, lft lftVar) {
        listPreference.I("inline_global_play_pause");
        listPreference.M(lftVar.a);
        ((DialogPreference) listPreference).a = lftVar.a;
        listPreference.n(lftVar.b);
        listPreference.e((CharSequence[]) lftVar.d.toArray(new CharSequence[0]));
        listPreference.h = (CharSequence[]) lftVar.e.toArray(new CharSequence[0]);
        listPreference.F(String.valueOf(fyx.a(aaddVar)));
    }
}
