package defpackage;

import android.text.TextUtils;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aays  reason: default package */
/* loaded from: classes.dex */
public final class aays extends aaqs {
    public byte[] a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean s;
    public boolean t;
    private final Set u;

    public aays(aaqf aaqfVar, afvm afvmVar, Set set) {
        super("live_chat/get_live_chat", aaqfVar, afvmVar);
        this.a = new byte[0];
        this.b = "";
        this.u = set;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arwc.a.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            createBuilder.copyOnWrite();
            arwc arwcVar = (arwc) createBuilder.instance;
            str.getClass();
            arwcVar.b |= 4;
            arwcVar.e = str;
        } else {
            byte[] bArr = this.a;
            if (bArr != null && bArr.length > 0) {
                aoob x = aoob.x(bArr);
                createBuilder.copyOnWrite();
                arwc arwcVar2 = (arwc) createBuilder.instance;
                arwcVar2.b |= 2;
                arwcVar2.d = x;
            }
        }
        if (this.c) {
            createBuilder.copyOnWrite();
            arwc arwcVar3 = (arwc) createBuilder.instance;
            arwcVar3.b |= 32;
            arwcVar3.g = true;
        }
        if (this.d) {
            createBuilder.copyOnWrite();
            arwc arwcVar4 = (arwc) createBuilder.instance;
            arwcVar4.b |= 64;
            arwcVar4.h = true;
        }
        if (this.s) {
            createBuilder.copyOnWrite();
            arwc arwcVar5 = (arwc) createBuilder.instance;
            arwcVar5.b |= 4096;
            arwcVar5.i = true;
        }
        if (this.t) {
            createBuilder.copyOnWrite();
            arwc arwcVar6 = (arwc) createBuilder.instance;
            arwcVar6.b |= 16;
            arwcVar6.f = true;
        }
        Set set = this.u;
        if (set != null && !set.isEmpty()) {
            for (aayr aayrVar : this.u) {
                if (aayrVar != null) {
                    aayrVar.a();
                }
            }
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
