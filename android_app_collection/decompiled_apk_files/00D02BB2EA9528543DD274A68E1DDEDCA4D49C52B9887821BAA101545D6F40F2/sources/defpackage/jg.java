package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jg  reason: default package */
/* loaded from: classes7.dex */
public final class jg {
    Context a;
    public String b;
    Intent[] c;
    ComponentName d;
    CharSequence e;
    CharSequence f;
    CharSequence g;
    public IconCompat h;
    akj[] i;
    Set<String> j;
    jb k;
    int l;
    PersistableBundle m;

    public static List<jg> b(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfo shortcutInfo : list) {
            arrayList.add(new jf(context, shortcutInfo).a());
        }
        return arrayList;
    }

    public final ShortcutInfo a() {
        int length;
        int length2;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.i(this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.l);
        PersistableBundle persistableBundle = this.m;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            akj[] akjVarArr = this.i;
            if (akjVarArr != null && (length2 = akjVarArr.length) > 0) {
                Person[] personArr = new Person[length2];
                for (int i = 0; i < length2; i++) {
                    personArr[i] = this.i[i].c();
                }
                intents.setPersons(personArr);
            }
            jb jbVar = this.k;
            if (jbVar != null) {
                intents.setLocusId(jbVar.b);
            }
            intents.setLongLived(false);
        } else {
            if (this.m == null) {
                this.m = new PersistableBundle();
            }
            akj[] akjVarArr2 = this.i;
            if (akjVarArr2 != null && (length = akjVarArr2.length) > 0) {
                this.m.putInt("extraPersonCount", length);
                int i2 = 0;
                while (i2 < this.i.length) {
                    PersistableBundle persistableBundle2 = this.m;
                    StringBuilder sb = new StringBuilder();
                    sb.append("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    String sb2 = sb.toString();
                    akj akjVar = this.i[i2];
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = akjVar.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", akjVar.c);
                    persistableBundle3.putString("key", akjVar.d);
                    persistableBundle3.putBoolean("isBot", akjVar.e);
                    persistableBundle3.putBoolean("isImportant", akjVar.f);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i2 = i3;
                }
            }
            jb jbVar2 = this.k;
            if (jbVar2 != null) {
                this.m.putString("extraLocusId", jbVar2.a);
            }
            this.m.putBoolean("extraLongLived", false);
            intents.setExtras(this.m);
        }
        return intents.build();
    }

    public final void c(Intent intent) {
        Bitmap bitmap;
        Intent[] intentArr = this.c;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.e.toString());
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            Context context = this.a;
            iconCompat.j(context);
            int i = iconCompat.a;
            if (i == 1) {
                bitmap = (Bitmap) iconCompat.b;
            } else if (i == 2) {
                try {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context.createPackageContext(iconCompat.e(), 0), iconCompat.e));
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException("Can't find package " + iconCompat.b, e);
                }
            } else if (i == 5) {
                bitmap = IconCompat.q((Bitmap) iconCompat.b, true);
            } else {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
    }
}
