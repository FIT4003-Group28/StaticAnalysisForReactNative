package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jf  reason: default package */
/* loaded from: classes7.dex */
public final class jf {
    private final jg a;

    public jf(Context context, ShortcutInfo shortcutInfo) {
        akj[] akjVarArr;
        String string;
        jg jgVar = new jg();
        this.a = jgVar;
        jgVar.a = context;
        jgVar.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        jgVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        jgVar.d = shortcutInfo.getActivity();
        jgVar.e = shortcutInfo.getShortLabel();
        jgVar.f = shortcutInfo.getLongLabel();
        jgVar.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        jgVar.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        jb jbVar = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            akjVarArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            akjVarArr = new akj[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                aki akiVar = new aki();
                akiVar.a = persistableBundle.getString("name");
                akiVar.c = persistableBundle.getString("uri");
                akiVar.d = persistableBundle.getString("key");
                akiVar.e = persistableBundle.getBoolean("isBot");
                akiVar.f = persistableBundle.getBoolean("isImportant");
                akjVarArr[i2] = akiVar.a();
                i2 = i3;
            }
        }
        jgVar.i = akjVarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        if (Build.VERSION.SDK_INT >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        jg jgVar2 = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                nb.c(locusId, "locusId cannot be null");
                String id = locusId.getId();
                nb.d(id);
                jbVar = new jb(id);
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                jbVar = new jb(string);
            }
        }
        jgVar2.k = jbVar;
        this.a.l = shortcutInfo.getRank();
        this.a.m = shortcutInfo.getExtras();
    }

    public jf(Context context, String str) {
        jg jgVar = new jg();
        this.a = jgVar;
        jgVar.a = context;
        jgVar.b = str;
    }

    public final jg a() {
        if (!TextUtils.isEmpty(this.a.e)) {
            jg jgVar = this.a;
            Intent[] intentArr = jgVar.c;
            if (intentArr != null && intentArr.length != 0) {
                return jgVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    public final void b(IconCompat iconCompat) {
        this.a.h = iconCompat;
    }

    public final void c(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void d(CharSequence charSequence) {
        this.a.e = charSequence;
    }

    public final void e(Intent intent) {
        this.a.c = new Intent[]{intent};
    }
}
