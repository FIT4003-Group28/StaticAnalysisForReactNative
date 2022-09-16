package defpackage;

import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: dum  reason: default package */
/* loaded from: classes3.dex */
public final class dum extends dux {
    public dum(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "Cfog4LflgT2iolh3HPox3StcneC5NLf0gw2aUonuaLJPKhbA1Wu66BmCWbM0jSOP", "XRAysRCCrF/RlmJ5xodLZ5BvI0f/oj90F0MWB6a7FmI=", aopaVar, i, 73);
    }

    @Override // defpackage.dux
    protected final void a() {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.d.invoke(null, this.a.a)).booleanValue();
            aopa aopaVar = this.g;
            if (true == booleanValue) {
                i = 2;
            }
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.Z = i - 1;
            dnwVar.d |= 8;
        } catch (InvocationTargetException unused) {
            aopa aopaVar2 = this.g;
            aopaVar2.copyOnWrite();
            dnw dnwVar3 = (dnw) aopaVar2.instance;
            dnw dnwVar4 = dnw.a;
            dnwVar3.Z = 2;
            dnwVar3.d |= 8;
        }
    }
}
