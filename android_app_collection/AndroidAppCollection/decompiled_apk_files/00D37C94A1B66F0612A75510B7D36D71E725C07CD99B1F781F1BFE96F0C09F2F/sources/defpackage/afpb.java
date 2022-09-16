package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: afpb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afpb implements Runnable {
    public final /* synthetic */ afpc a;
    private final /* synthetic */ int b;

    public /* synthetic */ afpb(afpc afpcVar) {
        this.a = afpcVar;
    }

    public /* synthetic */ afpb(afpc afpcVar, int i) {
        this.b = i;
        this.a = afpcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            afpc afpcVar = this.a;
            int lineCount = afpcVar.a.getLineCount();
            if (Build.VERSION.SDK_INT >= 29 && afpcVar.a.mo589getText().length() == 0) {
                lineCount = afpe.a(afpcVar.a);
            }
            afoy afoyVar = afpcVar.a;
            afop.av(afoyVar.b, lineCount, afoyVar.getLineHeight());
        } else if (i == 1) {
            afpc afpcVar2 = this.a;
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            afoy afoyVar2 = afpcVar2.a;
            afop.av(afoyVar2.b, afpe.a(afoyVar2), afpcVar2.a.getLineHeight());
        } else {
            this.a.d.c();
        }
    }
}
