package defpackage;
/* compiled from: PG */
/* renamed from: yvn  reason: default package */
/* loaded from: classes4.dex */
public final class yvn {
    public final ampg a;
    public final ampg b;

    public yvn(final Object obj, final Enum r4, final amty amtyVar) {
        ampg ampgVar = new ampg() { // from class: yuw
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                amty amtyVar2 = amty.this;
                Enum r1 = r4;
                Enum r3 = (Enum) amtyVar2.get(obj2);
                return r3 == null ? r1 : r3;
            }
        };
        this.b = new ampg() { // from class: yux
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                amty amtyVar2 = amty.this;
                Object obj3 = obj;
                Object obj4 = ((amxw) amtyVar2).e.get((Enum) obj2);
                return obj4 == null ? obj3 : obj4;
            }
        };
        this.a = ampgVar;
        r4.getClass();
        obj.getClass();
        Enum[] enumArr = (Enum[]) r4.getDeclaringClass().getEnumConstants();
        enumArr.getClass();
        aqxo.q(enumArr.length != ((amxw) amtyVar).d + (amtyVar.containsValue(r4) ^ 1) ? false : true, "uncovered enums in stringToEnumMap");
    }
}
