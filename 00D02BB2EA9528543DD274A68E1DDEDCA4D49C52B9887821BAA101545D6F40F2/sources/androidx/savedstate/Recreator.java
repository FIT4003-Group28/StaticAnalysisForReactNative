package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class Recreator implements l {
    private final avr a;

    public Recreator(avr avrVar) {
        this.a = avrVar;
    }

    @Override // defpackage.l
    public final void MV(m mVar, i iVar) {
        Class cls;
        if (iVar != i.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        mVar.Nh().b(this);
        Bundle a = this.a.Qg().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                try {
                    try {
                        Constructor declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(avn.class).getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            ((avn) declaredConstructor.newInstance(new Object[0])).a(this.a);
                        } catch (Exception e) {
                            throw new RuntimeException("Failed to instantiate " + str, e);
                        }
                    } catch (NoSuchMethodException e2) {
                        throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                    }
                } catch (ClassNotFoundException e3) {
                    throw new RuntimeException("Class " + str + " wasn't found", e3);
                }
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
}
