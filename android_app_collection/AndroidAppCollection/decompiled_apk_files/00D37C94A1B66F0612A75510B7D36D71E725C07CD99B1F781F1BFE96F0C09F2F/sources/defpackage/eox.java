package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.google.android.libraries.youtube.account.verification.ui.PhoneVerificationActivity;
import com.google.android.youtube.R;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PhoneDialerEndpointOuterClass$PhoneDialerEndpoint;
import com.google.protos.youtube.api.innertube.SendSmsEndpointOuterClass$SendSmsEndpoint;
import com.google.protos.youtube.api.innertube.ShowSystemToastActionOuterClass$ShowSystemToastAction;
import com.google.protos.youtube.api.innertube.StatusUpdateNotificationRendererOuterClass;
import com.google.protos.youtube.api.innertube.TextMessageEndpointOuterClass$TextMessageEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eox  reason: default package */
/* loaded from: classes3.dex */
public final class eox implements aafl {
    private final Context a;
    private final /* synthetic */ int b;

    public eox(Context context) {
        this.a = context;
    }

    public eox(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public eox(Context context, int i, byte[] bArr) {
        this.b = i;
        context.getClass();
        this.a = context;
    }

    private final Intent b() {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", this.a.getPackageName());
        } else {
            intent.setClassName("com.android.settings", "com.android.settings.Settings$AppNotificationSettingsActivity");
            intent.putExtra("app_package", this.a.getPackageName());
            intent.putExtra("app_uid", this.a.getApplicationInfo().uid);
        }
        return intent;
    }

    private final void c(int i) {
        Toast.makeText(this.a, this.a.getString(i), 1).show();
    }

    public eox(Context context, zhn zhnVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = context;
        zhnVar.getClass();
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Intent intent;
        arag aragVar;
        arag aragVar2;
        arag aragVar3 = null;
        arag aragVar4 = null;
        r13 = null;
        agcz agczVar = null;
        int i = 1;
        switch (this.b) {
            case 0:
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint) apzgVar.qm(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
                for (asmc asmcVar : androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.b) {
                    intent2.putExtra(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : "");
                }
                intent2.setType(androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.c);
                this.a.startActivity(Intent.createChooser(intent2, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.d));
                return;
            case 1:
                int d = aphq.d(((AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint) apzgVar.qm(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.androidOsApplicationSettingsEndpoint)).b);
                if (d != 0) {
                    i = d;
                }
                if (i == 2) {
                    intent = b();
                } else if (i != 3) {
                    intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    String valueOf = String.valueOf(this.a.getPackageName());
                    intent.setData(Uri.parse(valueOf.length() != 0 ? "package:".concat(valueOf) : new String("package:")));
                } else {
                    String str = ((AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint) apzgVar.qm(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.androidOsApplicationSettingsEndpoint)).c;
                    if (Build.VERSION.SDK_INT < 26 || TextUtils.isEmpty(str)) {
                        intent = b();
                    } else {
                        Intent intent3 = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                        intent3.putExtra("android.provider.extra.APP_PACKAGE", this.a.getPackageName());
                        intent3.putExtra("android.provider.extra.CHANNEL_ID", str);
                        intent = intent3;
                    }
                }
                this.a.startActivity(intent);
                return;
            case 2:
                if (((TextMessageEndpointOuterClass$TextMessageEndpoint) apzgVar.qm(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint)).b.isEmpty()) {
                    zep.b("Cannot send SMS without body.");
                    return;
                }
                TextMessageEndpointOuterClass$TextMessageEndpoint textMessageEndpointOuterClass$TextMessageEndpoint = (TextMessageEndpointOuterClass$TextMessageEndpoint) apzgVar.qm(TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint);
                String valueOf2 = String.valueOf(TextUtils.join(";", textMessageEndpointOuterClass$TextMessageEndpoint.c));
                Intent intent4 = new Intent("android.intent.action.SENDTO", Uri.parse(valueOf2.length() != 0 ? "smsto:".concat(valueOf2) : new String("smsto:")));
                intent4.putExtra("sms_body", textMessageEndpointOuterClass$TextMessageEndpoint.b);
                this.a.startActivity(intent4);
                return;
            case 3:
                String str2 = ((apiw) apzgVar.qm(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint)).b;
                if (TextUtils.isEmpty(str2)) {
                    c(R.string.error_link_cannot_be_opened);
                    return;
                }
                Uri j = zgt.j(str2);
                Context context = this.a;
                Intent intent5 = new Intent("android.intent.action.VIEW", j);
                ajgl.q(context, intent5);
                try {
                    this.a.startActivity(intent5.setFlags(268435456));
                    return;
                } catch (ActivityNotFoundException unused) {
                    c(R.string.authorized_url_error_browser_not_found);
                    return;
                }
            case 4:
                Intent intent6 = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", ((PhoneDialerEndpointOuterClass$PhoneDialerEndpoint) apzgVar.qm(PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint)).b, null));
                ajgl.q(this.a, intent6);
                if (yja.g(this.a, intent6)) {
                    this.a.startActivity(intent6.setFlags(268435456));
                    return;
                } else {
                    zag.q(this.a, R.string.error_no_phone_apps_installed, 1);
                    return;
                }
            case 5:
                SendSmsEndpointOuterClass$SendSmsEndpoint sendSmsEndpointOuterClass$SendSmsEndpoint = (SendSmsEndpointOuterClass$SendSmsEndpoint) apzgVar.qm(SendSmsEndpointOuterClass$SendSmsEndpoint.sendSmsEndpoint);
                String join = TextUtils.join(", ", sendSmsEndpointOuterClass$SendSmsEndpoint.b);
                Context context2 = this.a;
                Intent intent7 = new Intent("android.intent.action.SENDTO", Uri.fromParts("sms", join, null));
                ajgl.q(context2, intent7);
                intent7.putExtra("android.intent.extra.SUBJECT", sendSmsEndpointOuterClass$SendSmsEndpoint.d);
                intent7.putExtra("android.intent.extra.TEXT", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
                intent7.putExtra("sms_body", sendSmsEndpointOuterClass$SendSmsEndpoint.c);
                if (yja.g(this.a, intent7)) {
                    this.a.startActivity(intent7.setFlags(268435456));
                    return;
                } else {
                    zag.q(this.a, R.string.error_no_messaging_apps_installed, 1);
                    return;
                }
            case 6:
                Intent intent8 = new Intent();
                intent8.setClassName(this.a, "com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity");
                intent8.putExtra("navigation_endpoint", apzgVar.toByteArray());
                this.a.startActivity(intent8);
                return;
            case 7:
                Context context3 = this.a;
                apff apffVar = (apff) apzgVar.qm(AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint);
                Intent intent9 = new Intent(apffVar.d);
                List<ResolveInfo> queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent9, 0);
                String str3 = apffVar.c;
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ResolveInfo next = it.next();
                        if (str3.equals(next.activityInfo.packageName)) {
                            intent9.setComponent(new ComponentName(str3, next.activityInfo.name));
                        }
                    }
                }
                if ((apffVar.b & 4) != 0) {
                    intent9.setData(Uri.parse(apffVar.e));
                }
                for (asmc asmcVar2 : apffVar.f) {
                    int i2 = asmcVar2.c;
                    int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i4 == 0) {
                        intent9.putExtra(asmcVar2.e, i2 == 2 ? (String) asmcVar2.d : "");
                    } else if (i4 == 1) {
                        String str4 = asmcVar2.e;
                        if (i2 == 3) {
                            aragVar = (arag) asmcVar2.d;
                        } else {
                            aragVar = arag.a;
                        }
                        intent9.putExtra(str4, ajgl.b(aragVar));
                    } else if (i4 == 2) {
                        intent9.putExtra(asmcVar2.e, i2 == 4 ? ((Integer) asmcVar2.d).intValue() : 0);
                    } else if (i4 == 3) {
                        intent9.putExtra(asmcVar2.e, i2 == 5 ? ((Boolean) asmcVar2.d).booleanValue() : false);
                    } else if (i4 == 4) {
                        intent9.putExtra(asmcVar2.e, i2 == 6 ? ((Double) asmcVar2.d).doubleValue() : 0.0d);
                    }
                }
                if (!zew.D(this.a).h()) {
                    intent9.setFlags(268435456);
                }
                context3.startActivity(intent9);
                return;
            case 8:
                Intent intent10 = new Intent(this.a, PhoneVerificationActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, apzgVar));
                intent10.putExtra("command", bundle);
                this.a.startActivity(intent10);
                return;
            case 9:
                Uri j2 = zgt.j(((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c);
                Intent intent11 = new Intent("android.intent.action.VIEW", j2);
                if (this.a.getPackageManager().queryIntentActivities(intent11, 128).size() <= 0) {
                    zag.q(this.a, R.string.error_link_cannot_be_opened, 0);
                    return;
                }
                yja.c(this.a, intent11, j2);
                this.a.startActivity(intent11.setFlags(268435456));
                return;
            case 10:
                if (!apzgVar.qn(ShowSystemToastActionOuterClass$ShowSystemToastAction.showSystemToastAction)) {
                    return;
                }
                ShowSystemToastActionOuterClass$ShowSystemToastAction showSystemToastActionOuterClass$ShowSystemToastAction = (ShowSystemToastActionOuterClass$ShowSystemToastAction) apzgVar.qm(ShowSystemToastActionOuterClass$ShowSystemToastAction.showSystemToastAction);
                if ((showSystemToastActionOuterClass$ShowSystemToastAction.b & 1) != 0 && (aragVar3 = showSystemToastActionOuterClass$ShowSystemToastAction.c) == null) {
                    aragVar3 = arag.a;
                }
                Spanned b = ajgl.b(aragVar3);
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                Toast.makeText(this.a, b, 1).show();
                this.a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            case 11:
                agcu agcuVar = (agcu) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", agcu.class);
                if (agcuVar == null) {
                    String valueOf3 = String.valueOf(zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 21);
                    sb.append("incorrect parameter: ");
                    sb.append(valueOf3);
                    Log.e("UpdateNotificationActionCommand", sb.toString());
                    return;
                }
                aunb aunbVar = ((avti) apzgVar.qm(avti.b)).c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                auzf auzfVar = (auzf) aunbVar.qm(StatusUpdateNotificationRendererOuterClass.statusUpdateNotificationRenderer);
                Context context4 = this.a;
                String str5 = agcuVar.b;
                int i5 = agcuVar.a;
                if (auzfVar != null && (auzfVar.b & 1) != 0) {
                    fi fiVar = new fi(context4);
                    if ((auzfVar.b & 2) != 0) {
                        aragVar2 = auzfVar.d;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    fiVar.k(ajgl.b(aragVar2));
                    fiVar.r(2131231846);
                    if ((auzfVar.b & 1) != 0 && (aragVar4 = auzfVar.c) == null) {
                        aragVar4 = arag.a;
                    }
                    fiVar.j(ajgl.b(aragVar4));
                    aged b2 = aged.b(str5, i5, zhn.o());
                    agee.d(fiVar, b2);
                    agczVar = new agcz(fiVar.b(), b2);
                }
                if (agczVar != null) {
                    agczVar.a(this.a, true);
                    return;
                }
                String valueOf4 = String.valueOf(apzgVar.qm(avti.b));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 33);
                sb2.append("build systemNotification failed :");
                sb2.append(valueOf4);
                Log.e("UpdateNotificationActionCommand", sb2.toString());
                return;
            default:
                ahfe.h(this.a);
                return;
        }
    }
}
