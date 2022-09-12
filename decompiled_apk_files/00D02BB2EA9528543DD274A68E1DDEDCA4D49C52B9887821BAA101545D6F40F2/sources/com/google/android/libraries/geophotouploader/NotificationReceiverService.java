package com.google.android.libraries.geophotouploader;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationReceiverService extends IntentService {
    private static final String a = "GPU:".concat(NotificationReceiverService.class.getSimpleName());
    private Context b;

    public NotificationReceiverService() {
        super(a);
    }

    private final void a(boolean z) {
        this.b.getSharedPreferences("geo.uploader.shared_preference_file_key", 0).edit().putBoolean("geo.uploader.shared_preference_wifi_only_key", z).apply();
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = getApplicationContext();
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        cruu cruuVar;
        String action = intent.getAction();
        if (String.valueOf(action).length() == 0) {
            new String("Handling notification action: ");
        }
        try {
            crwb crwbVar = (crwb) dsqw.cq(crwb.y, (byte[]) dbsk.s(intent.getByteArrayExtra("geo.uploader.gpu_config_key")));
            if ("geo.uploader.cancel_upload_action".equals(action)) {
                cruuVar = crui.a;
            } else if ("geo.uploader.wait_for_wifi_action".equals(action)) {
                a(true);
                cruuVar = cruj.a;
            } else if ("geo.uploader.upload_now_action".equals(action)) {
                if (new crxq(this.b).c()) {
                    a(false);
                }
                cruuVar = cruk.a;
            } else {
                throw new IllegalArgumentException(action);
            }
            Intent intent2 = new Intent(this.b, UploadService.class);
            intent2.putExtra("geo.uploader.gpu_config_key", crwbVar.bS());
            cruv.a(this.b, intent2, cruuVar);
        } catch (dsrm e) {
            throw new RuntimeException("Error in parsing GpuConfig proto.", e);
        }
    }
}
