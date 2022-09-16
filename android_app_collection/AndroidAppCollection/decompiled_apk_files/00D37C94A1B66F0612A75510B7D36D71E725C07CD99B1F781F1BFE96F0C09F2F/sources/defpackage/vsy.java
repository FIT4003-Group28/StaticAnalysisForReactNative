package defpackage;

import java.io.EOFException;
/* compiled from: PG */
/* renamed from: vsy  reason: default package */
/* loaded from: classes4.dex */
public class vsy extends vso {
    protected int c;

    public vsy(vss vssVar) {
        super(vssVar);
    }

    @Override // defpackage.vso
    public void e(vsn vsnVar) {
        vsnVar.h(1L);
        int read = vsnVar.a.read();
        if (read >= 0) {
            vsnVar.i(1L);
            this.c = read;
            vsnVar.l(3);
            return;
        }
        throw new EOFException();
    }
}
