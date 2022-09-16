package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chi  reason: default package */
/* loaded from: classes2.dex */
public final class chi {
    public static final Map a;
    public static final amqo b;
    public final chg c = new chg(this);
    public final Map d = new HashMap();
    public final ajnp e;

    static {
        EnumMap enumMap = new EnumMap(cfv.class);
        a = enumMap;
        b = aqxo.i(new izn(1));
        enumMap.put((EnumMap) cfv.IMMEDIATE, (cfv) 4);
        enumMap.put((EnumMap) cfv.HIGH, (cfv) 3);
        enumMap.put((EnumMap) cfv.NORMAL, (cfv) 2);
        enumMap.put((EnumMap) cfv.LOW, (cfv) 1);
    }

    public chi(ajnp ajnpVar) {
        this.e = ajnpVar;
    }
}
