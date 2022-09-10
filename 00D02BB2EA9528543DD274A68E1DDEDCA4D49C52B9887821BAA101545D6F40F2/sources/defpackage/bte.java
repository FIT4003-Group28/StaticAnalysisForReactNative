package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bte  reason: default package */
/* loaded from: classes.dex */
public final class bte {
    public static final Map<bro, Integer> a;
    public static final dbty<Executor> b;
    public final btc c = new btc(this);
    public final Map<cac, btb> d = new HashMap();
    public final bti e;

    static {
        EnumMap enumMap = new EnumMap(bro.class);
        a = enumMap;
        b = dbud.a(new bsx());
        enumMap.put((EnumMap) bro.IMMEDIATE, (bro) 4);
        enumMap.put((EnumMap) bro.HIGH, (bro) 3);
        enumMap.put((EnumMap) bro.NORMAL, (bro) 2);
        enumMap.put((EnumMap) bro.LOW, (bro) 1);
    }

    public bte(bti btiVar) {
        this.e = btiVar;
    }
}
