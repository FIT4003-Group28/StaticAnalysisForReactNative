package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: aqm  reason: default package */
/* loaded from: classes2.dex */
public final class aqm {
    public final Bundle a;
    public ArrayList<String> b;
    private ArrayList<IntentFilter> c;

    public aqm(aqn aqnVar) {
        if (aqnVar == null) {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        this.a = new Bundle(aqnVar.a);
        if (!aqnVar.b().isEmpty()) {
            this.b = new ArrayList<>(aqnVar.b());
        }
        if (aqnVar.j().isEmpty()) {
            return;
        }
        this.c = new ArrayList<>(aqnVar.c);
    }

    public final aqn a() {
        ArrayList<IntentFilter> arrayList = this.c;
        if (arrayList != null) {
            this.a.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList<String> arrayList2 = this.b;
        if (arrayList2 != null) {
            this.a.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new aqn(this.a);
    }

    public final void c(int i) {
        this.a.putInt("connectionState", i);
    }

    public final void d(String str) {
        this.a.putString("status", str);
    }

    public final void e(int i) {
        this.a.putInt("deviceType", i);
    }

    public final void f(boolean z) {
        this.a.putBoolean("enabled", z);
    }

    public final void g(Bundle bundle) {
        this.a.putBundle("extras", bundle);
    }

    public final void h(int i) {
        this.a.putInt("playbackType", i);
    }

    public final void i(int i) {
        this.a.putInt("presentationDisplayId", i);
    }

    public final void j(int i) {
        this.a.putInt("volume", i);
    }

    public final void k(int i) {
        this.a.putInt("volumeHandling", i);
    }

    public final void l(int i) {
        this.a.putInt("volumeMax", i);
    }

    public final void b(Collection<IntentFilter> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (collection.isEmpty()) {
            return;
        }
        for (IntentFilter intentFilter : collection) {
            if (intentFilter != null) {
                if (this.c == null) {
                    this.c = new ArrayList<>();
                }
                if (!this.c.contains(intentFilter)) {
                    this.c.add(intentFilter);
                }
            } else {
                throw new IllegalArgumentException("filter must not be null");
            }
        }
    }

    public aqm(String str, String str2) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putString("id", str);
        bundle.putString("name", str2);
    }
}
