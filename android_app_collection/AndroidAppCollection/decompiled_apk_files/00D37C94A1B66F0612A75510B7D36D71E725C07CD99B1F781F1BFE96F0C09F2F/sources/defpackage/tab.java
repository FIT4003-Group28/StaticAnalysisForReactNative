package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: tab  reason: default package */
/* loaded from: classes4.dex */
public final class tab implements tct {
    public final tdb a;
    public final boolean b;
    private final /* synthetic */ int c;

    public tab(tdb tdbVar, ampq ampqVar, int i) {
        this.c = i;
        this.a = tdbVar;
        this.b = ((Boolean) ampqVar.e(false)).booleanValue();
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    public tab(tdb tdbVar, ampq ampqVar) {
        this.a = tdbVar;
        this.b = ((Boolean) ampqVar.e(false)).booleanValue();
    }

    @Override // defpackage.tct
    public final aooq a() {
        if (this.c == 0) {
            return awox.b;
        }
        return awot.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        if (this.c == 0) {
            final awox awoxVar = (awox) obj;
            return this.a.a(awoxVar.c).an(amon.a).c(new ayqe() { // from class: taa
                @Override // defpackage.ayqe
                public final Object a(Object obj2) {
                    tab tabVar = tab.this;
                    awox awoxVar2 = awoxVar;
                    try {
                        axmi a = EkoProcessor.a(awoxVar2.d.I(), (byte[]) ((ampq) obj2).e(tea.a), tabVar.b);
                        if (!a.a.f()) {
                            String valueOf = String.valueOf(a.a.getDescription());
                            throw new ted(valueOf.length() != 0 ? "Eko processor error: ".concat(valueOf) : new String("Eko processor error: "));
                        }
                        tdb tdbVar = tabVar.a;
                        String str = awoxVar2.c;
                        byte[] bArr = a.b;
                        bArr.getClass();
                        tdbVar.b(str, bArr);
                        return aynr.f();
                    } catch (IOException e) {
                        throw new ted("Invalid eko template", e);
                    }
                }
            });
        }
        final awot awotVar = (awot) obj;
        return this.a.a(awotVar.c).an(amon.a).c(new ayqe(tcsVar, awotVar, null) { // from class: szz
            public final /* synthetic */ tcs a;
            public final /* synthetic */ awot b;

            @Override // defpackage.ayqe
            public final Object a(Object obj2) {
                byte[] bArr;
                tab tabVar = tab.this;
                tcs tcsVar2 = this.a;
                awot awotVar2 = this.b;
                byte[] bArr2 = (byte[]) ((ampq) obj2).e(tea.a);
                try {
                    aopa createBuilder = awov.a.createBuilder();
                    aoob x = aoob.x(bArr2);
                    createBuilder.copyOnWrite();
                    awov awovVar = (awov) createBuilder.instance;
                    awovVar.b |= 1;
                    awovVar.c = x;
                    awon awonVar = tcsVar2.e;
                    if (awonVar != null) {
                        createBuilder.copyOnWrite();
                        awov awovVar2 = (awov) createBuilder.instance;
                        awovVar2.d = awonVar;
                        awovVar2.b |= 2;
                    }
                    awou awouVar = awotVar2.d;
                    if (awouVar == null) {
                        awouVar = awou.a;
                    }
                    createBuilder.copyOnWrite();
                    awov awovVar3 = (awov) createBuilder.instance;
                    awouVar.getClass();
                    awovVar3.e = awouVar;
                    awovVar3.b |= 4;
                    aoog O = aoog.O(awotVar2.toByteArray());
                    while (true) {
                        if (O.E()) {
                            bArr = tea.a;
                            break;
                        }
                        int n = O.n();
                        if (aosl.a(n) != 2) {
                            O.G(n);
                        } else {
                            bArr = O.H();
                            break;
                        }
                    }
                    axmi a = EkoProcessor.a(bArr, ((awov) createBuilder.mo39build()).toByteArray(), tabVar.b);
                    if (!a.a.f()) {
                        String valueOf = String.valueOf(a.a.getDescription());
                        throw new ted(valueOf.length() != 0 ? "Eko processor error: ".concat(valueOf) : new String("Eko processor error: "));
                    }
                    tdb tdbVar = tabVar.a;
                    String str = awotVar2.c;
                    byte[] bArr3 = a.b;
                    bArr3.getClass();
                    tdbVar.b(str, bArr3);
                    return aynr.f();
                } catch (IOException e) {
                    throw new ted("Invalid eko template", e);
                }
            }
        });
    }
}
