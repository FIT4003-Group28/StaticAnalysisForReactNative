package com.google.firebase.auth.v0.a;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<Pair<String, String>> f8451a;

    static {
        SparseArray<Pair<String, String>> sparseArray = new SparseArray<>();
        f8451a = sparseArray;
        sparseArray.put(17000, new Pair<>("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        f8451a.put(17002, new Pair<>("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        f8451a.put(17004, new Pair<>("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        f8451a.put(17008, new Pair<>("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        f8451a.put(17009, new Pair<>("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        f8451a.put(17024, new Pair<>("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        f8451a.put(17014, new Pair<>("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        f8451a.put(17012, new Pair<>("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        f8451a.put(17007, new Pair<>("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        f8451a.put(17025, new Pair<>("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        f8451a.put(17005, new Pair<>("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        f8451a.put(17021, new Pair<>("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        f8451a.put(17011, new Pair<>("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        f8451a.put(17017, new Pair<>("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key."));
        f8451a.put(17006, new Pair<>("ERROR_OPERATION_NOT_ALLOWED", "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."));
        f8451a.put(17026, new Pair<>("ERROR_WEAK_PASSWORD", "The given password is invalid."));
        f8451a.put(17029, new Pair<>("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
        f8451a.put(17030, new Pair<>("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
        f8451a.put(17031, new Pair<>("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
        f8451a.put(17033, new Pair<>("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
        f8451a.put(17032, new Pair<>("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
        f8451a.put(17034, new Pair<>("ERROR_MISSING_EMAIL", "An email address must be provided."));
        f8451a.put(17035, new Pair<>("ERROR_MISSING_PASSWORD", "A password must be provided."));
        f8451a.put(17041, new Pair<>("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
        f8451a.put(17042, new Pair<>("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
        f8451a.put(17043, new Pair<>("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code"));
        f8451a.put(17044, new Pair<>("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user."));
        f8451a.put(17045, new Pair<>("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID"));
        f8451a.put(17046, new Pair<>("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
        f8451a.put(17049, new Pair<>("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
        f8451a.put(17051, new Pair<>("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
        f8451a.put(17052, new Pair<>("ERROR_QUOTA_EXCEEDED", "The sms quota for this project has been exceeded."));
        f8451a.put(17028, new Pair<>("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verify that the correct package name and SHA-1 are configured in the Firebase Console."));
        f8451a.put(17063, new Pair<>("ERROR_API_NOT_AVAILABLE_WITHOUT_GOOGLE_PLAY", "The API that you are calling is not available on devices without Google Play services."));
        f8451a.put(17062, new Pair<>("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget."));
        f8451a.put(17064, new Pair<>("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash."));
        f8451a.put(17065, new Pair<>("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled."));
        f8451a.put(17040, new Pair<>("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request."));
        f8451a.put(17068, new Pair<>("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."));
        f8451a.put(17071, new Pair<>("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid."));
        f8451a.put(17057, new Pair<>("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish."));
        f8451a.put(17058, new Pair<>("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user."));
        f8451a.put(17072, new Pair<>("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID."));
        f8451a.put(17073, new Pair<>("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context."));
        f8451a.put(17074, new Pair<>("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project."));
        f8451a.put(17075, new Pair<>("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials"));
        f8451a.put(17077, new Pair<>("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user."));
        f8451a.put(17079, new Pair<>("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid."));
        f8451a.put(17078, new Pair<>("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account."));
        f8451a.put(17080, new Pair<>("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available."));
        f8451a.put(17081, new Pair<>("ERROR_MISSING_MULTI_FACTOR_SESSION", "The request is missing proof of first factor successful sign-in."));
        f8451a.put(17082, new Pair<>("ERROR_MISSING_MULTI_FACTOR_INFO", "No second factor identifier is provided."));
        f8451a.put(17083, new Pair<>("ERROR_INVALID_MULTI_FACTOR_SESSION", "The request does not contain a valid proof of first factor successful sign-in."));
        f8451a.put(17084, new Pair<>("ERROR_MULTI_FACTOR_INFO_NOT_FOUND", "The user does not have a second factor matching the identifier provided."));
        f8451a.put(17085, new Pair<>("ERROR_ADMIN_RESTRICTED_OPERATION", "This operation is restricted to administrators only."));
        f8451a.put(17086, new Pair<>("ERROR_UNVERIFIED_EMAIL", "This operation requires a verified email."));
        f8451a.put(17087, new Pair<>("ERROR_SECOND_FACTOR_ALREADY_ENROLLED", "The second factor is already enrolled on this account."));
        f8451a.put(17088, new Pair<>("ERROR_MAXIMUM_SECOND_FACTOR_COUNT_EXCEEDED", "The maximum allowed number of second factors on a user has been exceeded."));
        f8451a.put(17089, new Pair<>("ERROR_UNSUPPORTED_FIRST_FACTOR", "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor."));
        f8451a.put(17090, new Pair<>("ERROR_EMAIL_CHANGE_NEEDS_VERIFICATION", "Multi-factor users must always have a verified email."));
        f8451a.put(17091, new Pair<>("ERROR_INTERNAL_SUCCESS_SIGN_OUT", "This is an internal error code indicating that the operation was successful but the user needs to be signed out."));
        f8451a.put(17093, new Pair<>("ERROR_MISSING_CLIENT_IDENTIFIER", "This request is missing a reCAPTCHA token."));
        f8451a.put(17094, new Pair<>("ERROR_MISSING_OR_INVALID_NONCE", "The request does not contain a valid nonce. This can occur if the SHA-256 hash of the provided raw nonce does not match the hashed nonce in the ID token payload."));
        f8451a.put(18001, new Pair<>("ERROR_USER_CANCELLED", "The user did not grant your application the permissions it requested."));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.e.b.f a(com.google.android.gms.common.api.Status r3) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.v0.a.a2.a(com.google.android.gms.common.api.Status):c.e.b.f");
    }

    public static c.e.b.f a(Status status, com.google.firebase.auth.h hVar, String str, String str2) {
        int q = status.q();
        if (q == 17012 || q == 17007 || q == 17025) {
            com.google.firebase.auth.w wVar = new com.google.firebase.auth.w(a(q), a(b(q), status));
            wVar.a(hVar);
            wVar.a(str);
            wVar.b(str2);
            return wVar;
        }
        return a(status);
    }

    public static com.google.firebase.auth.t a(FirebaseAuth firebaseAuth, c.e.a.b.d.e.p2 p2Var, com.google.firebase.auth.z zVar) {
        c.e.a.b.d.e.m.a(firebaseAuth);
        c.e.a.b.d.e.m.a(p2Var);
        Pair<String, String> pair = f8451a.get(17078);
        return new com.google.firebase.auth.t((String) pair.first, (String) pair.second, com.google.firebase.auth.internal.q0.a(p2Var, firebaseAuth, zVar));
    }

    private static String a(int i) {
        Pair<String, String> pair = f8451a.get(i);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }

    private static String a(String str, Status status) {
        return TextUtils.isEmpty(status.r()) ? str : String.format(String.valueOf(str).concat(" [ %s ]"), status.r());
    }

    private static String b(int i) {
        Pair<String, String> pair = f8451a.get(i);
        return pair != null ? (String) pair.second : "An internal error has occurred.";
    }
}
