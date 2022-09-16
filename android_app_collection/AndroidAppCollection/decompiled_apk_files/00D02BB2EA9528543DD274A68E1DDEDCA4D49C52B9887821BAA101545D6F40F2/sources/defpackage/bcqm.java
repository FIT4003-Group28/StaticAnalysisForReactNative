package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bcqm  reason: default package */
/* loaded from: classes3.dex */
public final class bcqm implements Serializable {
    public transient dcdc<bczw> a;

    public bcqm(dcdc<bczw> dcdcVar) {
        this.a = dcdcVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = dcdc.e();
    }
}
