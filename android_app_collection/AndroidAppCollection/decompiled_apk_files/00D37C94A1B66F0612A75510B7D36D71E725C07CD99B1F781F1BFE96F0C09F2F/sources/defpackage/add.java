package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: add  reason: default package */
/* loaded from: classes.dex */
final class add implements u {
    final /* synthetic */ adm a;
    private final /* synthetic */ int b;

    public add(adm admVar) {
        this.a = admVar;
    }

    public add(adm admVar, int i) {
        this.b = i;
        this.a = admVar;
    }

    @Override // defpackage.u
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i = this.b;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                if (((adr) obj) == null) {
                    return;
                }
                this.a.aF();
                this.a.b.m(null);
                return;
            } else if (i == 2) {
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence == null) {
                    return;
                }
                adm admVar = this.a;
                if (admVar.s()) {
                    admVar.p(charSequence);
                }
                this.a.b.k(null);
                return;
            } else if (i == 3) {
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                adm admVar2 = this.a;
                if (admVar2.s()) {
                    admVar2.p(admVar2.N(R.string.fingerprint_not_recognized));
                }
                ady adyVar = admVar2.b;
                if (!adyVar.j) {
                    Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                } else {
                    adyVar.j().execute(new ade(admVar2, 1));
                }
                this.a.b.l(false);
                return;
            } else if (i == 4) {
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                if (this.a.r()) {
                    this.a.n();
                } else {
                    adm admVar3 = this.a;
                    CharSequence g = admVar3.b.g();
                    if (g == null) {
                        g = admVar3.N(R.string.default_error_msg);
                    }
                    admVar3.o(13, g);
                    admVar3.a(2);
                }
                this.a.b.q(false);
                return;
            } else if (!((Boolean) obj).booleanValue()) {
                return;
            } else {
                this.a.a(1);
                this.a.d();
                this.a.b.n(false);
                return;
            }
        }
        adb adbVar = (adb) obj;
        if (adbVar == null) {
            return;
        }
        adm admVar4 = this.a;
        int i3 = adbVar.a;
        CharSequence charSequence2 = adbVar.b;
        switch (i3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 6:
            default:
                i3 = 8;
                break;
        }
        Context rb = admVar4.rb();
        if (Build.VERSION.SDK_INT < 29) {
            if (i3 != 7) {
                if (i3 == 9) {
                    i3 = 9;
                }
            }
            if (rb != null && adn.d(rb) && acy.c(admVar4.b.d())) {
                admVar4.n();
                this.a.b.k(null);
            }
        }
        if (admVar4.s()) {
            if (charSequence2 == null) {
                charSequence2 = adj.b(admVar4.rb(), i3);
            }
            if (i3 == 5) {
                if (admVar4.b.h == 0) {
                    admVar4.aE(charSequence2);
                }
                admVar4.d();
            } else {
                if (admVar4.b.s) {
                    admVar4.o(i3, charSequence2);
                } else {
                    admVar4.p(charSequence2);
                    Handler handler = admVar4.a;
                    adf adfVar = new adf(admVar4, i3, charSequence2);
                    Context rb2 = admVar4.rb();
                    if (rb2 == null || !adi.d(rb2, Build.MODEL)) {
                        i2 = 2000;
                    }
                    handler.postDelayed(adfVar, i2);
                }
                admVar4.b.s = true;
            }
        } else {
            if (charSequence2 == null) {
                charSequence2 = admVar4.N(R.string.default_error_msg) + " " + i3;
            }
            admVar4.o(i3, charSequence2);
        }
        this.a.b.k(null);
    }
}
