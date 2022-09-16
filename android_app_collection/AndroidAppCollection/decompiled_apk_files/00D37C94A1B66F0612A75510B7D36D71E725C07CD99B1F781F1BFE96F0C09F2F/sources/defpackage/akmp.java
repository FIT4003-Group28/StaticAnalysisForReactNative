package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.protos.youtube.api.innertube.StoriesShareCommandOuterClass$StoriesShareCommand;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: akmp  reason: default package */
/* loaded from: classes.dex */
public final class akmp implements aafl {
    private static final String a = zep.a("ShareStoriesCommand");
    private final akkk b;

    public akmp(akkk akkkVar) {
        this.b = akkkVar;
    }

    private static final Bitmap b(aoob aoobVar) {
        return BitmapFactory.decodeByteArray(aoobVar.I(), 0, aoobVar.d());
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        int i;
        aoob aoobVar;
        long j;
        StoriesShareCommandOuterClass$StoriesShareCommand storiesShareCommandOuterClass$StoriesShareCommand = (StoriesShareCommandOuterClass$StoriesShareCommand) apzgVar.qm(StoriesShareCommandOuterClass$StoriesShareCommand.storiesShareCommand);
        Bitmap b = b(storiesShareCommandOuterClass$StoriesShareCommand.d);
        try {
            int aM = awwc.aM(storiesShareCommandOuterClass$StoriesShareCommand.e);
            if (aM == 0) {
                aM = 1;
            }
            i = aM - 1;
        } catch (Exception e) {
            e = e;
        }
        try {
            if (i == 1) {
                zep.c(a, "STORY_SHARE_TARGET_SNAPCHAT_CAMERA is unimplemented.");
            } else if (i == 2) {
                if (storiesShareCommandOuterClass$StoriesShareCommand.b == 2) {
                    aoobVar = (aoob) storiesShareCommandOuterClass$StoriesShareCommand.c;
                } else {
                    aoobVar = aoob.b;
                }
                Bitmap b2 = b(aoobVar);
                akkk akkkVar = this.b;
                String str = storiesShareCommandOuterClass$StoriesShareCommand.f;
                String str2 = storiesShareCommandOuterClass$StoriesShareCommand.g;
                Intent intent = new Intent();
                intent.setDataAndType(Uri.parse("snapchat://creativekit/preview/1"), "image/*");
                intent.putExtra("CLIENT_ID", str2);
                intent.setPackage("com.snapchat.android");
                try {
                    File a2 = akkkVar.a(b, "sticker");
                    File a3 = akkkVar.a(b2, "background");
                    int intValue = ((Integer) zew.p(akkkVar.a).first).intValue();
                    int width = b.getWidth();
                    int height = b.getHeight();
                    double d = intValue;
                    Double.isNaN(d);
                    long round = Math.round(d * 0.65d);
                    int i2 = (int) round;
                    if (round == i2) {
                        Pair create = Pair.create(Integer.valueOf(i2), Integer.valueOf(height * (i2 / width)));
                        try {
                            int intValue2 = ((Integer) create.first).intValue();
                            int intValue3 = ((Integer) create.second).intValue();
                            Uri a4 = gf.a(akkkVar.a, akkkVar.b(), a2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("uri", a4);
                            jSONObject.put("posX", 0.5d);
                            jSONObject.put("posY", 0.5d);
                            jSONObject.put("width", intValue2);
                            jSONObject.put("height", intValue3);
                            intent.putExtra("sticker", jSONObject.toString());
                            akkkVar.a.grantUriPermission("com.snapchat.android", a4, 1);
                            intent.putExtra("android.intent.extra.STREAM", gf.a(akkkVar.a, akkkVar.b(), a3));
                            intent.setAction("android.intent.action.SEND");
                            if (!TextUtils.isEmpty(str)) {
                                intent.putExtra("attachmentUrl", str);
                            }
                            try {
                                PackageInfo packageInfo = akkkVar.a.getPackageManager().getPackageInfo("com.snapchat.android", 0);
                                if (Build.VERSION.SDK_INT >= 28) {
                                    j = packageInfo.getLongVersionCode();
                                } else {
                                    j = packageInfo.versionCode;
                                }
                                if (j >= 2110) {
                                    intent.putExtra("RESULT_INTENT", PendingIntent.getActivity(akkkVar.a, 0, intent, zgd.M() | 1073741824));
                                    intent.addFlags(268435456);
                                    akkkVar.a.startActivity(intent);
                                    return;
                                }
                                akkkVar.a.startActivityForResult(intent, 0);
                                return;
                            } catch (PackageManager.NameNotFoundException e2) {
                                throw new Exception("Snapchat is not installed.", e2);
                            }
                        } catch (JSONException e3) {
                            throw new Exception("Failed to set sticker data.", e3);
                        }
                    }
                    throw new ArithmeticException();
                } catch (IOException e4) {
                    throw new Exception("Failed to create story sharing assets.", e4);
                }
            } else {
                zep.c(a, "Unknown story share target.");
            }
        } catch (Exception e5) {
            e = e5;
            zep.f(a, "Unable to create share intent.", e);
        }
    }
}
