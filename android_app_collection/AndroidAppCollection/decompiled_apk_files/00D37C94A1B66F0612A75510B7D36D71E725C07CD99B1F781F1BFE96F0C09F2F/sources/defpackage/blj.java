package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: blj  reason: default package */
/* loaded from: classes2.dex */
public final class blj {
    public Bundle b;
    public boolean c;
    private blg e;
    public final acu a = new acu();
    public boolean d = true;

    public final Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void b(String str, bli bliVar) {
        if (((bli) this.a.b(str, bliVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public final void c(Class cls) {
        if (this.d) {
            if (this.e == null) {
                this.e = new blg(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                blg blgVar = this.e;
                blgVar.a.add(cls.getName());
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
