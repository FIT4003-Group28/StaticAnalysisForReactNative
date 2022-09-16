package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vdz  reason: default package */
/* loaded from: classes4.dex */
public final class vdz implements Externalizable {
    private static final long serialVersionUID = 1;
    public final List a = new ArrayList();

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            vdy vdyVar = new vdy();
            vdyVar.readExternal(objectInput);
            this.a.add(vdyVar);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        int size = this.a.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((vdy) this.a.get(i)).writeExternal(objectOutput);
        }
    }
}
