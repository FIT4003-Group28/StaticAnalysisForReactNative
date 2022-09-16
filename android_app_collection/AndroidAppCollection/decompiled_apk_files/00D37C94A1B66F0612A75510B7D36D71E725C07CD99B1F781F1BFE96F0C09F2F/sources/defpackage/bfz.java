package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bfz  reason: default package */
/* loaded from: classes2.dex */
public final class bfz {
    public final Bundle a;
    public ArrayList b;
    private ArrayList c;

    public bfz(bga bgaVar) {
        if (bgaVar == null) {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        this.a = new Bundle(bgaVar.a);
        if (!bgaVar.q().isEmpty()) {
            this.b = new ArrayList(bgaVar.q());
        }
        if (bgaVar.p().isEmpty()) {
            return;
        }
        this.c = new ArrayList(bgaVar.c);
    }

    public final bga a() {
        ArrayList<? extends Parcelable> arrayList = this.c;
        if (arrayList != null) {
            this.a.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList<String> arrayList2 = this.b;
        if (arrayList2 != null) {
            this.a.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new bga(this.a);
    }

    public final void b(IntentFilter intentFilter) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (!this.c.contains(intentFilter)) {
            this.c.add(intentFilter);
        }
    }

    public final void d(int i) {
        this.a.putInt("connectionState", i);
    }

    public final void e(String str) {
        this.a.putString("status", str);
    }

    public final void f(int i) {
        this.a.putInt("deviceType", i);
    }

    public final void g(boolean z) {
        this.a.putBoolean("enabled", z);
    }

    public final void h(Bundle bundle) {
        if (bundle == null) {
            this.a.putBundle("extras", null);
        } else {
            this.a.putBundle("extras", new Bundle(bundle));
        }
    }

    public final void i(int i) {
        this.a.putInt("playbackType", i);
    }

    public final void j(int i) {
        this.a.putInt("presentationDisplayId", i);
    }

    public final void k(int i) {
        this.a.putInt("volume", i);
    }

    public final void l(int i) {
        this.a.putInt("volumeHandling", i);
    }

    public final void m(int i) {
        this.a.putInt("volumeMax", i);
    }

    public final void c(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                b(intentFilter);
            }
        }
    }

    public bfz(String str, String str2) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str == null) {
            throw new NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }
}
