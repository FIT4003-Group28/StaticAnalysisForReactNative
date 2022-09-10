package defpackage;

import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dgwx  reason: default package */
/* loaded from: classes6.dex */
public final class dgwx<T extends Enum<T>> extends dgtl<T> {
    private final Map<String, T> a = new HashMap();
    private final Map<T, String> b = new HashMap();

    public dgwx(Class<T> cls) {
        T[] enumConstants;
        try {
            for (T t : cls.getEnumConstants()) {
                String name = t.name();
                dgto dgtoVar = (dgto) cls.getField(name).getAnnotation(dgto.class);
                if (dgtoVar != null) {
                    name = dgtoVar.a();
                    for (String str : dgtoVar.b()) {
                        this.a.put(str, t);
                    }
                }
                this.a.put(name, t);
                this.b.put(t, name);
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Object a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        return this.a.get(dgxeVar.h());
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Object obj) {
        Enum r3 = (Enum) obj;
        dgxgVar.j(r3 == null ? null : this.b.get(r3));
    }
}
