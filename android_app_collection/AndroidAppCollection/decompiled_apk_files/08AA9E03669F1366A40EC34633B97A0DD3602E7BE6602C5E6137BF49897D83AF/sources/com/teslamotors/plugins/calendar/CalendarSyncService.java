package com.teslamotors.plugins.calendar;

import android.app.IntentService;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.baidu.mapapi.UIMsg;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
import com.teslamotors.plugins.client.d.a.a;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class CalendarSyncService extends IntentService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5270a = "CalendarSyncService";

    public CalendarSyncService() {
        super(f5270a);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("force_sync", true);
        boolean booleanExtra2 = intent.getBooleanExtra("sync_enabled", false);
        a(intent.getLongExtra("vid", -1L), intent.getIntExtra("retries", 0), intent.getStringExtra("reason"), getApplicationContext(), Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), null);
    }

    static c a(long j, String str, Context context, Boolean bool, Boolean bool2) {
        a aVar;
        if (j == -1) {
            Log.i(f5270a, "No vehicle id. Not syncing");
            return new c("CALENDAR_SYNC_NO_SELECTED_VEHICLE", null);
        } else if (!bool2.booleanValue() && !bool.booleanValue()) {
            Log.i(f5270a, "Calendar sync is off and is not forced. Not syncing");
            return new c("CALENDAR_SYNC_NOT_REQUIRED", null);
        } else {
            if (bool2.booleanValue()) {
                aVar = a.a(context);
            } else {
                aVar = new a();
                aVar.a(true);
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            com.teslamotors.plugins.client.e a2 = com.teslamotors.plugins.client.e.a(context);
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject b2 = aVar.b();
                b2.put("reason", str);
                b2.put("uuid", a2.j());
                b2.put("phone_name", defaultAdapter != null ? defaultAdapter.getName() : null);
                b2.put("access_disabled", aVar.a());
                jSONObject.put("calendar_data", b2);
                return new c(null, jSONObject);
            } catch (Exception e) {
                Log.e(f5270a, "Failed to serialize calendar data", e);
                return new c("CALENDAR_SYNC_FAILED_TO_SEND", null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(long j, String str, Context context, Boolean bool, Boolean bool2) {
        c a2 = a(j, str, context, bool, bool2);
        if (a2.f5291a != null) {
            return a2.f5291a;
        }
        com.teslamotors.plugins.client.c a3 = com.teslamotors.plugins.client.e.a(context).a(a2.f5292b, j, "CALENDAR_SYNC", null).a();
        return a3 != null ? com.teslamotors.plugins.client.c.n.contains(a3) ? "CALENDAR_SYNC_NOT_REQUIRED" : "CALENDAR_SYNC_FAILED_TO_SEND" : "CALENDAR_SYNC_NO_ERROR";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final long j, int i, String str, Context context, Boolean bool, Boolean bool2, final af afVar) {
        final c a2 = a(j, str, context, bool, bool2);
        if (a2.f5291a != null) {
            b(afVar, a2.f5291a);
            return;
        }
        final com.teslamotors.plugins.client.e a3 = com.teslamotors.plugins.client.e.a(context);
        com.teslamotors.plugins.client.d.a.a aVar = new com.teslamotors.plugins.client.d.a.a();
        aVar.a(i);
        com.teslamotors.plugins.client.d.a.b bVar = new com.teslamotors.plugins.client.d.a.b();
        bVar.a(UIMsg.d_ResultType.SHORT_URL);
        bVar.b(UIMsg.m_AppUI.MSG_APP_DATA_OK);
        aVar.a(bVar);
        aVar.a(new a.c() { // from class: com.teslamotors.plugins.calendar.CalendarSyncService.1
            @Override // com.teslamotors.plugins.client.d.a.a.c
            public void a(final a.d dVar) {
                com.teslamotors.plugins.client.e.this.a(a2.f5292b, j, "CALENDAR_SYNC", new com.teslamotors.plugins.client.a.b() { // from class: com.teslamotors.plugins.calendar.CalendarSyncService.1.1
                    @Override // com.teslamotors.plugins.client.a.b
                    public void a(JSONObject jSONObject) {
                        dVar.a(null, jSONObject);
                    }

                    @Override // com.teslamotors.plugins.client.a.b
                    public void a(com.teslamotors.plugins.client.c cVar) {
                        dVar.a(cVar.a(), null);
                    }
                });
            }
        });
        aVar.a(new a.InterfaceC0116a() { // from class: com.teslamotors.plugins.calendar.CalendarSyncService.2
            @Override // com.teslamotors.plugins.client.d.a.a.InterfaceC0116a
            public void a(com.teslamotors.plugins.client.d.a.a aVar2, String str2, Object obj) {
                if (str2 == null) {
                    if (obj == null) {
                        return;
                    }
                    CalendarSyncService.b(af.this, "CALENDAR_SYNC_NO_ERROR");
                    return;
                }
                String str3 = CalendarSyncService.f5270a;
                Log.e(str3, "Failed to sync calendar:" + str2);
                CalendarSyncService.b(af.this, "CALENDAR_SYNC_FAILED_TO_SEND");
            }
        });
        aVar.a(new a.b() { // from class: com.teslamotors.plugins.calendar.CalendarSyncService.3

            /* renamed from: a  reason: collision with root package name */
            private int f5277a = 0;

            @Override // com.teslamotors.plugins.client.d.a.a.b
            public boolean a(com.teslamotors.plugins.client.d.a.a aVar2, String str2, Object obj) {
                if (com.teslamotors.plugins.client.c.o.contains(str2)) {
                    return false;
                }
                if (com.teslamotors.plugins.client.c.OWNERAPI_ERROR_UNKNOWN_ERROR.a().equalsIgnoreCase(str2)) {
                    this.f5277a++;
                }
                return this.f5277a < 3 && obj == null;
            }
        });
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(af afVar, String str) {
        if (afVar != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(BiometricAuthenticationModule.RESULT, str);
            afVar.a(writableNativeMap);
        }
    }

    public static Intent a(Context context, Intent intent) {
        com.teslamotors.plugins.client.e a2 = com.teslamotors.plugins.client.e.a(context);
        long m = a2.m();
        if (m == -1 || !"VEHICLE".equals(a2.n())) {
            Log.i(f5270a, "Not building calendar service intent; no stored vehicle id or non-vehicle product selected");
            return null;
        }
        boolean booleanExtra = intent.getBooleanExtra("force_sync", false);
        boolean booleanExtra2 = intent.getBooleanExtra("sync_enabled", com.teslamotors.plugins.client.e.a(context).p());
        String stringExtra = intent.getStringExtra("reason");
        int intExtra = intent.getIntExtra("retries", 0);
        if (stringExtra == null) {
            stringExtra = "calendar-updated";
            intExtra = 2;
        }
        Intent intent2 = new Intent(context, CalendarSyncService.class);
        intent2.putExtra("vid", m);
        intent2.putExtra("force_sync", booleanExtra);
        intent2.putExtra("sync_enabled", booleanExtra2);
        intent2.putExtra("reason", stringExtra);
        intent2.putExtra("retries", intExtra);
        return intent2;
    }
}
