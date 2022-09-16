package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aone  reason: default package */
/* loaded from: classes.dex */
public final class aone {
    public String a;
    public Map b;
    public Map c;

    public aone() {
        a("", new EnumMap(aona.class));
    }

    public final void a(String str, EnumMap enumMap) {
        this.a = str;
        this.b = enumMap;
        this.c = new EnumMap(aona.class);
    }

    public aone(aong aongVar) {
        this.a = aongVar.a;
        this.b = new EnumMap(aongVar.b);
        this.c = new EnumMap(aongVar.c);
    }
}
