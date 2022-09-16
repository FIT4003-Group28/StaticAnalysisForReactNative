package defpackage;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
/* compiled from: PG */
/* renamed from: akj  reason: default package */
/* loaded from: classes2.dex */
public final class akj {
    public final CharSequence a;
    final IconCompat b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public akj(aki akiVar) {
        this.a = akiVar.a;
        this.b = akiVar.b;
        this.c = akiVar.c;
        this.d = akiVar.d;
        this.e = akiVar.e;
        this.f = akiVar.f;
    }

    public static akj a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        aki akiVar = new aki();
        akiVar.a = bundle.getCharSequence("name");
        IconCompat iconCompat = null;
        if (bundle2 != null) {
            int i = bundle2.getInt("type");
            IconCompat iconCompat2 = new IconCompat(i);
            iconCompat2.e = bundle2.getInt("int1");
            iconCompat2.f = bundle2.getInt("int2");
            iconCompat2.k = bundle2.getString("string1");
            if (bundle2.containsKey("tint_list")) {
                iconCompat2.g = (ColorStateList) bundle2.getParcelable("tint_list");
            }
            if (bundle2.containsKey("tint_mode")) {
                iconCompat2.i = PorterDuff.Mode.valueOf(bundle2.getString("tint_mode"));
            }
            switch (i) {
                case -1:
                case 1:
                case 5:
                    iconCompat2.b = bundle2.getParcelable("obj");
                    iconCompat = iconCompat2;
                    break;
                case 0:
                default:
                    String str = "Unknown type " + i;
                    break;
                case 2:
                case 4:
                case 6:
                    iconCompat2.b = bundle2.getString("obj");
                    iconCompat = iconCompat2;
                    break;
                case 3:
                    iconCompat2.b = bundle2.getByteArray("obj");
                    iconCompat = iconCompat2;
                    break;
            }
        }
        akiVar.b = iconCompat;
        akiVar.c = bundle.getString("uri");
        akiVar.d = bundle.getString("key");
        akiVar.e = bundle.getBoolean("isBot");
        akiVar.f = bundle.getBoolean("isImportant");
        return akiVar.a();
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
            }
            bundle.putInt("type", iconCompat.a);
            bundle.putInt("int1", iconCompat.e);
            bundle.putInt("int2", iconCompat.f);
            bundle.putString("string1", iconCompat.k);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            if (iconCompat.i != IconCompat.h) {
                bundle.putString("tint_mode", iconCompat.i.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f);
        return bundle2;
    }

    public final Person c() {
        Person.Builder name = new Person.Builder().setName(this.a);
        IconCompat iconCompat = this.b;
        return name.setIcon(iconCompat != null ? iconCompat.h() : null).setUri(this.c).setKey(this.d).setBot(this.e).setImportant(this.f).build();
    }
}
