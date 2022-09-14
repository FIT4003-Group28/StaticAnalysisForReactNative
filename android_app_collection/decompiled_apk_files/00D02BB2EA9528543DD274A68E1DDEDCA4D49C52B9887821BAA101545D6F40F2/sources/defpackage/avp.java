package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: avp  reason: default package */
/* loaded from: classes.dex */
public final class avp {
    public Bundle b;
    public boolean c;
    private avm e;
    public final aho<String, avo> a = new aho<>();
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

    public final void b(String str, avo avoVar) {
        if (this.a.d(str, avoVar) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public final void c(Class<? extends avn> cls) {
        if (this.d) {
            if (this.e == null) {
                this.e = new avm(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                avm avmVar = this.e;
                avmVar.a.add(cls.getName());
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
