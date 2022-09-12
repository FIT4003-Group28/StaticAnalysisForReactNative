package defpackage;

import defpackage.bsb;
/* compiled from: PG */
/* renamed from: bsb  reason: default package */
/* loaded from: classes.dex */
public class bsb<CHILD extends bsb<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public ciu<? super TranscodeType> a = (ciu<? super TranscodeType>) cir.b;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
