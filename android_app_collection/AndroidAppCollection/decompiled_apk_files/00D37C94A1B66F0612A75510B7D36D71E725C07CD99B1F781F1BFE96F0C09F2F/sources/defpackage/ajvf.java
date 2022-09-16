package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ajvf  reason: default package */
/* loaded from: classes.dex */
public final class ajvf {
    public final arak a;
    public final List b;
    public arag c;

    public ajvf(araj arajVar) {
        int i;
        arak arakVar;
        arak arakVar2;
        arak arakVar3;
        arajVar.getClass();
        int i2 = arajVar.b;
        arag aragVar = null;
        if (i2 == 1) {
            arakVar = (arak) arajVar.c;
            i = 1;
        } else {
            i = i2;
            arakVar = null;
        }
        this.a = arakVar;
        this.b = arajVar.d;
        if (i == 1) {
            arakVar2 = (arak) arajVar.c;
        } else {
            arakVar2 = arak.a;
        }
        if ((arakVar2.b & 1) != 0) {
            if (arajVar.b == 1) {
                arakVar3 = (arak) arajVar.c;
            } else {
                arakVar3 = arak.a;
            }
            aragVar = arakVar3.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        }
        this.c = aragVar;
    }
}
