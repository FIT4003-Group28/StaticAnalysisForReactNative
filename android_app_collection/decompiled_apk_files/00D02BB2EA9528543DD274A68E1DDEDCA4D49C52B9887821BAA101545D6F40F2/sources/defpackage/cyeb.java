package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.filament.R;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.core.Experiments;
import com.google.android.libraries.social.populous.core.SessionContextRuleSet;
import com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource;
/* compiled from: PG */
/* renamed from: cyeb  reason: default package */
/* loaded from: classes5.dex */
public final class cyeb implements Parcelable.Creator<ClientConfigInternal> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientConfigInternal createFromParcel(Parcel parcel) {
        int i;
        boolean booleanValue = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        ClientId clientId = (ClientId) parcel.readParcelable(ClientConfigInternal.R);
        int readInt = parcel.readInt();
        dhdj b = dhdj.b(parcel.readInt());
        dued b2 = dued.b(parcel.readInt());
        dbsg i2 = parcel.readByte() == 1 ? dbsg.i(dued.b(parcel.readInt())) : dbpy.a;
        duey b3 = duey.b(parcel.readInt());
        boolean booleanValue2 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        dcep K = dcep.K(cybp.c(parcel, cydt.class));
        boolean booleanValue3 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        boolean booleanValue4 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        boolean booleanValue5 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        dcep K2 = dcep.K(cybp.d(parcel, dhdf.U));
        boolean booleanValue6 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        int b4 = dudf.b(parcel.readInt());
        SocialAffinityAllEventSource socialAffinityAllEventSource = (SocialAffinityAllEventSource) parcel.readParcelable(ClientConfigInternal.R);
        cyfk cyfkVar = cyfk.values()[parcel.readInt()];
        cyfk cyfkVar2 = cyfk.values()[parcel.readInt()];
        dcep K3 = dcep.K(cybp.c(parcel, cyfk.class));
        boolean booleanValue7 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        boolean booleanValue8 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        cyei cyeiVar = cyei.values()[parcel.readInt()];
        boolean booleanValue9 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        cygp cygpVar = cygp.values()[parcel.readInt()];
        cygp cygpVar2 = cygp.values()[parcel.readInt()];
        boolean booleanValue10 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        cyeh cyehVar = cyeh.values()[parcel.readInt()];
        boolean booleanValue11 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        boolean booleanValue12 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        boolean booleanValue13 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        SessionContextRuleSet sessionContextRuleSet = (SessionContextRuleSet) parcel.readParcelable(ClientConfigInternal.R);
        Experiments experiments = (Experiments) parcel.readParcelable(ClientConfigInternal.R);
        dcep K4 = dcep.K(cybp.d(parcel, dhfr.o));
        boolean booleanValue14 = ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue();
        int readInt2 = parcel.readInt();
        if (readInt2 == 0) {
            i = 2;
        } else if (readInt2 == 3) {
            i = 5;
        } else if (readInt2 == 4) {
            i = 6;
        } else if (readInt2 == 6) {
            i = 8;
        } else if (readInt2 != 7) {
            switch (readInt2) {
                case 10:
                    i = 12;
                    break;
                case 11:
                    i = 13;
                    break;
                case 12:
                    i = 14;
                    break;
                case 13:
                    i = 15;
                    break;
                case 14:
                    i = 16;
                    break;
                default:
                    switch (readInt2) {
                        case 17:
                            i = 19;
                            break;
                        case 18:
                            i = 20;
                            break;
                        case 19:
                            i = 21;
                            break;
                        case 20:
                            i = 22;
                            break;
                        case 21:
                            i = 23;
                            break;
                        case 22:
                            i = 24;
                            break;
                        case 23:
                            i = 25;
                            break;
                        case 24:
                            i = 26;
                            break;
                        case 25:
                            i = 27;
                            break;
                        case 26:
                            i = 28;
                            break;
                        case 27:
                            i = 29;
                            break;
                        case 28:
                            i = 30;
                            break;
                        case 29:
                            i = 31;
                            break;
                        default:
                            switch (readInt2) {
                                case 35:
                                    i = 37;
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                    i = 38;
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                    i = 39;
                                    break;
                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                    i = 40;
                                    break;
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    i = 41;
                                    break;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    i = 42;
                                    break;
                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    i = 43;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                    }
            }
        } else {
            i = 9;
        }
        return new ClientConfigInternal(booleanValue, clientId, readInt, b, b2, i2, b3, booleanValue2, K, booleanValue3, booleanValue4, readLong, readLong2, booleanValue5, K2, booleanValue6, b4, socialAffinityAllEventSource, cyfkVar, cyfkVar2, K3, booleanValue7, booleanValue8, cyeiVar, booleanValue9, cygpVar, cygpVar2, booleanValue10, cyehVar, booleanValue11, booleanValue12, booleanValue13, sessionContextRuleSet, experiments, K4, booleanValue14, i, ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue(), dcep.K(cybp.d(parcel, dhew.h)), parcel.readInt() == 1, ((Boolean) parcel.readValue(ClientConfigInternal.R)).booleanValue(), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientConfigInternal[] newArray(int i) {
        return new ClientConfigInternal[i];
    }
}
