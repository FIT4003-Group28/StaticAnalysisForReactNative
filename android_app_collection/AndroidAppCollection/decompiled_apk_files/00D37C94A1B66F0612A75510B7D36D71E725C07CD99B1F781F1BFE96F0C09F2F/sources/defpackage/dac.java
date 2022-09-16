package defpackage;
/* compiled from: PG */
/* renamed from: dac  reason: default package */
/* loaded from: classes3.dex */
public final class dac extends daq {
    private final daq d;
    private final daq e;

    /* JADX INFO: Access modifiers changed from: protected */
    public dac(daq daqVar, daq daqVar2) {
        super(null);
        this.d = daqVar;
        this.e = daqVar2;
    }

    @Override // defpackage.daq
    public final void a(Object obj) {
        this.d.a(obj);
        this.e.a(obj);
    }

    @Override // defpackage.daq
    public final boolean b(daq daqVar) {
        if (this == daqVar) {
            return true;
        }
        if (daqVar == null || daqVar.getClass() != getClass()) {
            return false;
        }
        dac dacVar = (dac) daqVar;
        return this.d.b(dacVar.d) && this.e.b(dacVar.e);
    }
}
