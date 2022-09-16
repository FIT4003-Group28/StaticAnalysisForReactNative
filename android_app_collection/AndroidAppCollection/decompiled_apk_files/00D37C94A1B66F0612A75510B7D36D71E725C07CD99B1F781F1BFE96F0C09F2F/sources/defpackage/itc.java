package defpackage;
/* compiled from: PG */
/* renamed from: itc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class itc implements ylv {
    public final /* synthetic */ afzf a;
    private final /* synthetic */ int b;

    public /* synthetic */ itc(afzf afzfVar, int i) {
        this.b = i;
        this.a = afzfVar;
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            b((Throwable) obj);
        } else if (i == 1) {
            b((Throwable) obj);
        } else if (i == 2) {
            b((Throwable) obj);
        } else if (i == 3) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        cff cffVar;
        int i = this.b;
        if (i == 0) {
            afzf afzfVar = this.a;
            if (th instanceof cff) {
                cffVar = (cff) th;
            } else {
                cffVar = new cff(th);
            }
            afzfVar.kV(cffVar);
        } else if (i == 1) {
            afzf afzfVar2 = this.a;
            int i2 = gim.c;
            if (th instanceof cff) {
                afzfVar2.kV((cff) th);
            } else {
                zep.d("Error getting GetSettingsResponseModel", th);
            }
        } else if (i == 2) {
            afzf afzfVar3 = this.a;
            int i3 = xoh.a;
            afzfVar3.kV((cff) th);
        } else if (i == 3) {
            afzf afzfVar4 = this.a;
            int i4 = abbs.a;
            if (th instanceof cff) {
                afzfVar4.kV((cff) th);
            } else {
                afzfVar4.kV(new cff(th));
            }
        } else {
            afzf afzfVar5 = this.a;
            int i5 = abdc.a;
            if (th instanceof cff) {
                afzfVar5.kV((cff) th);
            } else {
                afzfVar5.kV(new cff(th));
            }
        }
    }
}
