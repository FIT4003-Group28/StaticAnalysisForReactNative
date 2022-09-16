package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.android.billingclient.api.BillingClientNativeCallback;
import com.android.billingclient.api.SkuDetails;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.PlayBillingCommandOuterClass$PlayBillingCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: ybq  reason: default package */
/* loaded from: classes4.dex */
public final class ybq implements cdx, ceg, ynl {
    public static final String a = "ybq";
    cdp b;
    PlayBillingCommandOuterClass$PlayBillingCommand c;
    private final Activity d;
    private final aafo e;
    private final afvn f;
    private final yat g;
    private final aagi h;
    private final axxc i;
    private final Object j = new Object();
    private int k = 0;
    private boolean l = false;
    private boolean m = false;

    public ybq(Activity activity, yni yniVar, afvn afvnVar, aafo aafoVar, axxc axxcVar, aagi aagiVar) {
        this.d = activity;
        this.f = afvnVar;
        this.e = aafoVar;
        this.i = axxcVar;
        this.h = aagiVar;
        yat yatVar = new yat();
        this.g = yatVar;
        yatVar.b = new DialogInterface.OnKeyListener() { // from class: ybp
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                ybq ybqVar = ybq.this;
                if (i == 4) {
                    ybqVar.c();
                    ybqVar.e();
                    return true;
                }
                return true;
            }
        };
        yniVar.g(this);
    }

    private final synchronized void i(PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand) {
        ceb a2;
        String str = a;
        zep.h(str, "Continue billing flow.");
        this.m = false;
        if (playBillingCommandOuterClass$PlayBillingCommand != null) {
            try {
                atxx atxxVar = playBillingCommandOuterClass$PlayBillingCommand.c;
                if (atxxVar == null) {
                    atxxVar = atxx.a;
                }
                cdy cdyVar = new cdy();
                if (atxxVar.d.size() == 0) {
                    zep.c(str, "invalid play cart payload, empty sku details");
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
                    sb.append("playPayment::");
                    sb.append(str);
                    sb.append(" invalid play cart payload, empty sku details");
                    afus.b(2, 11, sb.toString());
                    a2 = cdyVar.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : atxxVar.d) {
                        try {
                            arrayList.add(new SkuDetails(str2));
                        } catch (IllegalArgumentException | JSONException e) {
                            String valueOf = String.valueOf(str2);
                            String concat = valueOf.length() != 0 ? "Invalid SkuDetails json string: ".concat(valueOf) : new String("Invalid SkuDetails json string: ");
                            String str3 = a;
                            String valueOf2 = String.valueOf(e);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 1 + String.valueOf(valueOf2).length());
                            sb2.append(concat);
                            sb2.append(" ");
                            sb2.append(valueOf2);
                            zep.c(str3, sb2.toString());
                            String valueOf3 = String.valueOf(e);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 15 + String.valueOf(concat).length() + String.valueOf(valueOf3).length());
                            sb3.append("playPayment::");
                            sb3.append(str3);
                            sb3.append(" ");
                            sb3.append(concat);
                            sb3.append(" ");
                            sb3.append(valueOf3);
                            afus.b(2, 11, sb3.toString());
                            a2 = cdyVar.a();
                        }
                    }
                    cdyVar.b = arrayList;
                    if ((atxxVar.b & 1) != 0 && !atxxVar.c.isEmpty()) {
                        cdz cdzVar = new cdz();
                        cdzVar.a = atxxVar.c;
                        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(cdzVar.a)) {
                            throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
                        }
                        cea ceaVar = new cea();
                        ceaVar.a = cdzVar.a;
                        cdyVar.a = ceaVar.a;
                    }
                    a2 = cdyVar.a();
                }
                String str4 = a;
                zep.h(str4, "Start loading play cart.");
                ced a3 = this.b.a(this.d, a2);
                int i = a3.a;
                String str5 = a3.b;
                StringBuilder sb4 = new StringBuilder(String.valueOf(str5).length() + 37);
                sb4.append("Play cart loading result:");
                sb4.append(i);
                sb4.append(" ");
                sb4.append(str5);
                zep.h(str4, sb4.toString());
                int i2 = a3.a;
                if (i2 != 0) {
                    String str6 = a3.b;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str6).length() + 77);
                    sb5.append("Can not display the play cart, error code is: ");
                    sb5.append(i2);
                    sb5.append(", debug message is: ");
                    sb5.append(str6);
                    String sb6 = sb5.toString();
                    zep.c(str4, sb6);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(str4).length() + 14 + String.valueOf(sb6).length());
                    sb7.append("playPayment::");
                    sb7.append(str4);
                    sb7.append(" ");
                    sb7.append(sb6);
                    afus.b(2, 11, sb7.toString());
                    return;
                }
                zep.h(str4, "Display the play cart successfully.");
                return;
            } catch (IllegalArgumentException e2) {
                String valueOf4 = String.valueOf(e2.getMessage());
                String concat2 = valueOf4.length() != 0 ? "Can not display the play cart. Billing flow params is empty because ".concat(valueOf4) : new String("Can not display the play cart. Billing flow params is empty because ");
                String str7 = a;
                zep.c(str7, concat2);
                StringBuilder sb8 = new StringBuilder(String.valueOf(str7).length() + 14 + String.valueOf(concat2).length());
                sb8.append("playPayment::");
                sb8.append(str7);
                sb8.append(" ");
                sb8.append(concat2);
                afus.b(2, 11, sb8.toString());
                return;
            }
        }
        zep.c(str, "Continue billing flow failed because play billing command is null.");
        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 80);
        sb9.append("playPayment::");
        sb9.append(str);
        sb9.append(" Continue billing flow failed because play billing command is null.");
        afus.b(2, 11, sb9.toString());
    }

    private final void j() {
        synchronized (this.j) {
            if (this.l) {
                return;
            }
            this.g.show(this.d.getFragmentManager(), yat.a);
            this.l = true;
        }
    }

    @Override // defpackage.cdx
    public final void a(ced cedVar) {
        String str = a;
        int i = cedVar.a;
        String str2 = cedVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 60);
        sb.append("Play Billing Client Setup Finished with result: ");
        sb.append(i);
        sb.append(" ");
        sb.append(str2);
        zep.h(str, sb.toString());
        int i2 = cedVar.a;
        if (i2 == -1) {
            zep.m(str, "Billing client service is disconnected, need to reconnect it.");
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 75);
            sb2.append("playPayment::");
            sb2.append(str);
            sb2.append(" Billing client service is disconnected, need to reconnect it.");
            afus.b(1, 11, sb2.toString());
            h();
        } else if (i2 == 0) {
            if (!this.m) {
                return;
            }
            e();
            i(this.c);
        } else {
            String str3 = cedVar.b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 75);
            sb3.append("Billing client setup failure: error code is ");
            sb3.append(i2);
            sb3.append(" , error message is ");
            sb3.append(str3);
            String sb4 = sb3.toString();
            zep.c(str, sb4);
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(sb4).length());
            sb5.append("playPayment::");
            sb5.append(str);
            sb5.append(" ");
            sb5.append(sb4);
            afus.b(2, 11, sb5.toString());
            if (!this.m) {
                return;
            }
            e();
            c();
        }
    }

    @Override // defpackage.ceg
    public final void b(ced cedVar, List list) {
        String str = a;
        int i = cedVar.a;
        String str2 = cedVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41);
        sb.append("Receive Play payment update: ");
        sb.append(i);
        sb.append(" ");
        sb.append(str2);
        zep.h(str, sb.toString());
        int i2 = cedVar.a;
        if (i2 == -1) {
            h();
        } else if (i2 != 0) {
            if (i2 != 1) {
                PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand = this.c;
                if (playBillingCommandOuterClass$PlayBillingCommand == null) {
                    zep.c(str, "Handle default payment result failed, because play billing command is empty.");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 90);
                    sb2.append("playPayment::");
                    sb2.append(str);
                    sb2.append(" Handle default payment result failed, because play billing command is empty.");
                    afus.b(2, 11, sb2.toString());
                } else {
                    aafo aafoVar = this.e;
                    apzg apzgVar = playBillingCommandOuterClass$PlayBillingCommand.e;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                }
            } else {
                PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand2 = this.c;
                if (playBillingCommandOuterClass$PlayBillingCommand2 == null) {
                    zep.c(str, "Handle cancelled payment result failed, because play billing command is empty.");
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 92);
                    sb3.append("playPayment::");
                    sb3.append(str);
                    sb3.append(" Handle cancelled payment result failed, because play billing command is empty.");
                    afus.b(2, 11, sb3.toString());
                } else {
                    aafo aafoVar2 = this.e;
                    apzg apzgVar2 = playBillingCommandOuterClass$PlayBillingCommand2.d;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar2.a(apzgVar2);
                    c();
                }
            }
        } else if (list == null || list.isEmpty()) {
            zep.c(str, "FirstPartyPurchases value is null or empty");
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 56);
            sb4.append("playPayment::");
            sb4.append(str);
            sb4.append(" FirstPartyPurchases value is null or empty");
            afus.b(2, 11, sb4.toString());
        } else {
            PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand3 = this.c;
            if (playBillingCommandOuterClass$PlayBillingCommand3 == null) {
                zep.c(str, "PlayBillingCommand is null");
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40);
                sb5.append("playPayment::");
                sb5.append(str);
                sb5.append(" PlayBillingCommand is null");
                afus.b(2, 11, sb5.toString());
            } else if ((playBillingCommandOuterClass$PlayBillingCommand3.b & 64) != 0) {
                aagh a2 = this.h.a(this.f.c());
                String str3 = this.c.g;
                str3.getClass();
                aqxo.z(!str3.isEmpty(), "key cannot be empty");
                aopa createBuilder = aqcq.a.createBuilder();
                createBuilder.copyOnWrite();
                aqcq aqcqVar = (aqcq) createBuilder.instance;
                aqcqVar.b |= 1;
                aqcqVar.c = str3;
                aqcn aqcnVar = new aqcn(createBuilder);
                aopa createBuilder2 = aqcu.a.createBuilder();
                aopa createBuilder3 = aqcw.a.createBuilder();
                ArrayList arrayList = new ArrayList();
                amzt listIterator = ((amuk) list).listIterator();
                while (listIterator.hasNext()) {
                    cef cefVar = (cef) listIterator.next();
                    aopa createBuilder4 = aqcv.a.createBuilder();
                    String optString = cefVar.a.optString("purchaseId");
                    createBuilder4.copyOnWrite();
                    aqcv aqcvVar = (aqcv) createBuilder4.instance;
                    optString.getClass();
                    aqcvVar.b |= 1;
                    aqcvVar.c = optString;
                    int i3 = cefVar.a.optInt("purchaseState", 1) != 4 ? 2 : 3;
                    createBuilder4.copyOnWrite();
                    aqcv aqcvVar2 = (aqcv) createBuilder4.instance;
                    aqcvVar2.d = i3 - 1;
                    aqcvVar2.b |= 2;
                    arrayList.add((aqcv) createBuilder4.mo39build());
                }
                createBuilder3.copyOnWrite();
                aqcw aqcwVar = (aqcw) createBuilder3.instance;
                aopu aopuVar = aqcwVar.b;
                if (!aopuVar.c()) {
                    aqcwVar.b = aopi.mutableCopy(aopuVar);
                }
                aonk.addAll((Iterable) arrayList, (List) aqcwVar.b);
                createBuilder2.copyOnWrite();
                aqcu aqcuVar = (aqcu) createBuilder2.instance;
                aqcw aqcwVar2 = (aqcw) createBuilder3.mo39build();
                aqcwVar2.getClass();
                aqcuVar.c = aqcwVar2;
                aqcuVar.b = 1;
                aqcu aqcuVar2 = (aqcu) createBuilder2.mo39build();
                aopa aopaVar = aqcnVar.a;
                aopaVar.copyOnWrite();
                aqcq aqcqVar2 = (aqcq) aopaVar.instance;
                aqcuVar2.getClass();
                aqcqVar2.d = aqcuVar2;
                aqcqVar2.b |= 2;
                aqcp a3 = aqcnVar.a(a2);
                aajs c = a2.c();
                c.d(a3);
                c.b().T();
                aafo aafoVar3 = this.e;
                apzg apzgVar3 = this.c.f;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aafoVar3.a(apzgVar3);
            } else {
                zep.c(str, "CommerceAcquisitionClientPayloadEntityKey is null in the PlayBillingCommand");
                StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 89);
                sb6.append("playPayment::");
                sb6.append(str);
                sb6.append(" CommerceAcquisitionClientPayloadEntityKey is null in the PlayBillingCommand");
                afus.b(2, 11, sb6.toString());
            }
        }
        this.c = null;
    }

    public final void c() {
        this.m = false;
        this.c = null;
    }

    public final void d() {
        zep.h(a, "Clean up on app destroy or account switch.");
        c();
        this.k = 0;
        cdp cdpVar = this.b;
        if (cdpVar == null) {
            return;
        }
        try {
            cdn cdnVar = cdpVar.d;
            cdm cdmVar = cdnVar.b;
            Context context = cdnVar.a;
            if (cdmVar.b) {
                context.unregisterReceiver(cdmVar.c.b);
                cdmVar.b = false;
            } else {
                ceh.e("BillingBroadcastManager", "Receiver is not registered.");
            }
            if (cdpVar.f != null) {
                cdw cdwVar = cdpVar.f;
                synchronized (cdwVar.a) {
                    cdwVar.c = null;
                    cdwVar.b = true;
                }
            }
            if (cdpVar.f != null && cdpVar.p != null) {
                int i = ceh.a;
                cdpVar.e.unbindService(cdpVar.f);
                cdpVar.f = null;
            }
            cdpVar.p = null;
            ExecutorService executorService = cdpVar.o;
            if (executorService != null) {
                executorService.shutdownNow();
                cdpVar.o = null;
            }
        } catch (Exception e) {
            ceh.g("There was an exception while ending connection!", e);
        } finally {
            cdpVar.a = 3;
        }
        this.b = null;
    }

    public final void e() {
        synchronized (this.j) {
            if (!this.l) {
                return;
            }
            this.g.dismiss();
            this.l = false;
        }
    }

    public final synchronized void g(PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand) {
        String str = a;
        zep.h(str, "Start launch billing flow.");
        if (playBillingCommandOuterClass$PlayBillingCommand == null) {
            zep.c(str, "Launch billing flow failed because play billing command is null.");
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("playPayment::");
            sb.append(str);
            sb.append(" Launch billing flow failed because play billing command is null.");
            afus.b(2, 11, sb.toString());
            return;
        }
        this.c = playBillingCommandOuterClass$PlayBillingCommand;
        this.m = true;
        cdp cdpVar = this.b;
        if (cdpVar == null || cdpVar.a != 2) {
            h();
        } else {
            i(playBillingCommandOuterClass$PlayBillingCommand);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                d();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }

    public final synchronized void h() {
        String a2;
        cdp cdpVar = this.b;
        if (cdpVar == null || cdpVar.a != 2) {
            cdp cdpVar2 = this.b;
            if (cdpVar2 != null && cdpVar2.a == 1) {
                if (!this.m) {
                    return;
                }
                j();
                return;
            }
            ((Boolean) this.i.a.a.V(axwv.p).B().aw()).booleanValue();
            if (this.k >= 3) {
                String str = a;
                zep.m(str, "Reach the reconnection limit for the billing client in the current activity cycle.");
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 96);
                sb.append("playPayment::");
                sb.append(str);
                sb.append(" Reach the reconnection limit for the billing client in the current activity cycle.");
                afus.b(1, 11, sb.toString());
                if (!this.m) {
                    return;
                }
                e();
                c();
                zag.r(this.d, "Something went wrong, try again later.", 1);
                return;
            }
            if (this.m) {
                j();
            }
            cdp cdpVar3 = this.b;
            if (cdpVar3 == null || cdpVar3.a == 3) {
                afvm c = this.f.c();
                if (!(c instanceof AccountIdentity)) {
                    String str2 = a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 71);
                    sb2.append("playPayment::");
                    sb2.append(str2);
                    sb2.append(" Failed to get buyer email: It is not an account identity.");
                    afus.b(2, 11, sb2.toString());
                    a2 = null;
                } else {
                    a2 = ((AccountIdentity) c).a();
                }
                if (a2 == null) {
                    String str3 = a;
                    zep.c(str3, "Can not warm up billing client because there's no account email.");
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 78);
                    sb3.append("playPayment::");
                    sb3.append(str3);
                    sb3.append(" Can not warm up billing client because there's no account email.");
                    afus.b(2, 11, sb3.toString());
                    return;
                }
                cdo cdoVar = new cdo(this.d);
                cdoVar.d = this;
                cdoVar.b = true;
                cdoVar.a = a2;
                BillingClientNativeCallback billingClientNativeCallback = cdoVar.e;
                if (cdoVar.d == null) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                BillingClientNativeCallback billingClientNativeCallback2 = cdoVar.e;
                if (cdoVar.b) {
                    BillingClientNativeCallback billingClientNativeCallback3 = cdoVar.e;
                    this.b = new cdp(cdoVar.a, cdoVar.b, cdoVar.c, cdoVar.d);
                } else {
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
            }
            this.k++;
            zep.h(a, "Play Billing Client start connection.");
            cdp cdpVar4 = this.b;
            if (cdpVar4.c()) {
                int i = ceh.a;
                a(cee.g);
            } else if (cdpVar4.a == 1) {
                ceh.e("BillingClient", "Client is already in the process of connecting to billing service.");
                a(cee.c);
            } else if (cdpVar4.a == 3) {
                ceh.e("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                a(cee.h);
            } else {
                cdpVar4.a = 1;
                cdn cdnVar = cdpVar4.d;
                cdm cdmVar = cdnVar.b;
                Context context = cdnVar.a;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                if (!cdmVar.b) {
                    context.registerReceiver(cdmVar.c.b, intentFilter);
                    cdmVar.b = true;
                }
                int i2 = ceh.a;
                cdpVar4.f = new cdw(cdpVar4, this);
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                List<ResolveInfo> queryIntentServices = cdpVar4.e.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    ResolveInfo resolveInfo = queryIntentServices.get(0);
                    if (resolveInfo.serviceInfo != null) {
                        String str4 = resolveInfo.serviceInfo.packageName;
                        String str5 = resolveInfo.serviceInfo.name;
                        if (!"com.android.vending".equals(str4) || str5 == null) {
                            ceh.e("BillingClient", "The device doesn't have valid Play Store.");
                        } else {
                            ComponentName componentName = new ComponentName(str4, str5);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            intent2.putExtra("playBillingLibraryVersion", cdpVar4.b);
                            if (cdpVar4.e.bindService(intent2, cdpVar4.f, 1)) {
                                return;
                            }
                            ceh.e("BillingClient", "Connection to Billing service is blocked.");
                        }
                    }
                }
                cdpVar4.a = 0;
                a(cee.b);
            }
        }
    }
}
