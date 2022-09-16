package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: urh  reason: default package */
/* loaded from: classes4.dex */
public final class urh {
    public final uac a;
    public final upg b;
    public final String c;
    private final upx d;

    public urh(Context context, uac uacVar, upx upxVar, upg upgVar) {
        this.a = uacVar;
        this.d = upxVar;
        this.b = upgVar;
        this.c = context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt a(final ampg ampgVar) {
        return amnt.f(this.d.a(), new anir() { // from class: urf
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final urh urhVar = urh.this;
                ampg ampgVar2 = ampgVar;
                final List<Account> list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                for (Account account : list) {
                    arrayList.add((ankt) ampgVar2.apply(urhVar.a.a(account)));
                }
                return amnt.h(new Callable() { // from class: urg
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v0 */
                    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
                    /* JADX WARN: Type inference failed for: r8v15 */
                    /* JADX WARN: Type inference failed for: r8v2 */
                    /* JADX WARN: Type inference failed for: r8v3 */
                    /* JADX WARN: Type inference failed for: r8v4 */
                    /* JADX WARN: Type inference failed for: r8v40 */
                    /* JADX WARN: Type inference failed for: r8v41 */
                    /* JADX WARN: Type inference failed for: r8v42 */
                    /* JADX WARN: Type inference failed for: r8v43 */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        upg upgVar;
                        String str;
                        aogp aogpVar;
                        boolean z;
                        urh urhVar2 = urh.this;
                        List list2 = list;
                        List list3 = arrayList;
                        int size = list2.size();
                        amuf h = amuk.h(size);
                        ?? r8 = 0;
                        int i = 0;
                        while (i < size) {
                            uqa a = uqc.a();
                            a.b(((Account) list2.get(i)).name);
                            ankt anktVar = (ankt) list3.get(i);
                            aqxo.y(anktVar.isDone());
                            String str2 = "OK";
                            try {
                                try {
                                    aogpVar = (aogp) ankn.b(anktVar, MdiOwnersLoader$MdiException.class);
                                } catch (Throwable th) {
                                    urhVar2.b.a(str2, urhVar2.c);
                                    throw th;
                                }
                            } catch (anlr e) {
                                e = e;
                            } catch (MdiOwnersLoader$MdiException e2) {
                                e = e2;
                            }
                            if (aogpVar == null) {
                                str2 = "Absent";
                                a.e(r8);
                                upgVar = urhVar2.b;
                                str = urhVar2.c;
                                r8 = r8;
                            } else if (aogpVar.b.size() <= 0) {
                                Log.e("OneGoogle", "GetPeopleResponse contains no persons");
                                urhVar2.b.a("NoPerson", urhVar2.c);
                                h.h(a.a());
                                i++;
                                r8 = r8;
                            } else {
                                aopu aopuVar = aogpVar.b;
                                int i2 = r8 == true ? 1 : 0;
                                int i3 = r8 == true ? 1 : 0;
                                int i4 = r8 == true ? 1 : 0;
                                int i5 = r8 == true ? 1 : 0;
                                int i6 = r8 == true ? 1 : 0;
                                int i7 = r8 == true ? 1 : 0;
                                int i8 = r8 == true ? 1 : 0;
                                int i9 = r8 == true ? 1 : 0;
                                int i10 = r8 == true ? 1 : 0;
                                int i11 = r8 == true ? 1 : 0;
                                int i12 = r8 == true ? 1 : 0;
                                alzc alzcVar = ((aogq) aopuVar.get(i2)).b;
                                if (alzcVar == null) {
                                    alzcVar = alzc.a;
                                }
                                if (alzcVar.d.size() > 0) {
                                    alzg alzgVar = (alzg) alzcVar.d.get(r8);
                                    a.d = alzgVar.c;
                                    try {
                                        a.d(new aops(alzgVar.d, alzg.a).contains(alze.GOOGLE_ONE_USER));
                                        a.h = true != new aops(alzgVar.d, alzg.a).contains(alze.GOOGLE_FAMILY_CHILD_USER) ? 3 : 2;
                                        a.c(new aops(alzgVar.d, alzg.a).contains(alze.GOOGLE_APPS_USER));
                                    } catch (anlr | MdiOwnersLoader$MdiException e3) {
                                        e = e3;
                                        r8 = 0;
                                        Throwable cause = e.getCause();
                                        str2 = zgd.T(cause);
                                        qsp qspVar = (qsp) zgd.U(cause, qsp.class);
                                        if (qspVar != null) {
                                            int a2 = qspVar.a();
                                            StringBuilder sb = new StringBuilder(24);
                                            sb.append("ApiException-");
                                            sb.append(a2);
                                            str2 = sb.toString();
                                            if (a2 == 17) {
                                                throw new ExecutionException(new MdiNotAvailableException$ApiNotConnectedException(cause));
                                            }
                                            if (a2 == 10) {
                                                throw new ExecutionException(new MdiNotAvailableException$DeveloperErrorException(cause));
                                            }
                                        }
                                        Log.e("OneGoogle", "Failed to load profile data", e);
                                        upgVar = urhVar2.b;
                                        str = urhVar2.c;
                                        r8 = r8;
                                        upgVar.a(str2, str);
                                        h.h(a.a());
                                        i++;
                                        r8 = r8;
                                    }
                                }
                                if (alzcVar.b.size() > 0) {
                                    alzb alzbVar = (alzb) alzcVar.b.get(0);
                                    int i13 = alzbVar.b;
                                    String str3 = null;
                                    a.a = (i13 & 2) != 0 ? alzbVar.c : null;
                                    a.b = (i13 & 16) != 0 ? alzbVar.d : null;
                                    if ((i13 & 32) != 0) {
                                        str3 = alzbVar.e;
                                    }
                                    a.c = str3;
                                }
                                alzf b = ubi.b(aogpVar);
                                if (b != null) {
                                    if (b.e) {
                                        a.f = b.d;
                                    } else {
                                        a.e = b.d;
                                    }
                                }
                                if (alzcVar.e.size() == 1) {
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    int b2 = amel.b(((alza) alzcVar.e.get(0)).b);
                                    if (b2 == 0 || b2 == 1) {
                                        a.g = 1;
                                    } else if (b2 == 2) {
                                        a.g = 2;
                                    } else if (b2 != 4) {
                                        a.g = 4;
                                    } else {
                                        a.g = 3;
                                    }
                                } else {
                                    z = false;
                                }
                                upgVar = urhVar2.b;
                                str = urhVar2.c;
                                r8 = z;
                            }
                            upgVar.a(str2, str);
                            h.h(a.a());
                            i++;
                            r8 = r8;
                        }
                        return h.g();
                    }
                }, anjk.a, anlz.j(arrayList));
            }
        }, anjk.a);
    }
}
